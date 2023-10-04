package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.StatsDto;
import com.careerit.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IplStatsDaoImpl implements  IplStatsDao{

    private static final String TOP_PAID_PLAYERS= """
            select id,name,role,amount,team as team_name,label as team_label
                from(
                    select id,name,role,amount,team,label,dense_rank() over( order by amount desc) rnk
                    from player where label=?) t
                where t.rnk=1;
            """;
    @Override
    public double totalAmountSpentBy(String teamName) {
        return 0;
    }

    @Override
    public List<String> teamNames() {
        return null;
    }

    @Override
    public List<Player> getMaxPaidPlayers(String teamName) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(TOP_PAID_PLAYERS);
            pst.setString(1,teamName.toUpperCase());
            rs = pst.executeQuery();
            while (rs.next()) {
                players.add(convertRowPlayerObject(rs));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectionUtil.close(rs,pst,con);
        }
        return players;
    }

    private Player convertRowPlayerObject(ResultSet rs) throws SQLException {
        String name = rs.getString("name");
        String role = rs.getString("role");
        double amount = rs.getDouble("amount");
        String teamName = rs.getString("team_name");
        String teamLabel = rs.getString("team_label");
        long id = rs.getLong("id");
        return Player.builder()
                .amount(amount)
                .id(id)
                .name(name)
                .role(role)
                .teamLabel(teamLabel)
                .teamName(teamName)
                .build();
    }

    @Override
    public List<StatsDto> getTeamStats() {
        return null;
    }
}
