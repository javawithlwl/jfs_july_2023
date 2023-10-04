package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IplStatsDaoTest {

        @Test
        void topPaidPlayersByTeam(){
            IplStatsDao obj = new IplStatsDaoImpl();
            String teamName = "CSK";
            List<Player> playerList = obj.getMaxPaidPlayers(teamName);
            System.out.println(playerList);
            Assertions.assertEquals(2,playerList.size());
        }
}
