package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.IPlayerDto;
import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.dto.RoleStatsDto;
import com.careerit.iplstats.dto.TeamStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player,Long> {

        @Query("select distinct p.teamLabel from Player p")
        List<String> selectTeamNames();

        @Query("""
                  select new com.careerit.iplstats.dto.TeamStatsDto(p.teamLabel,sum(p.amount)) 
                    from Player p 
                    group by p.teamLabel order by sum(p.amount) desc
                """)
        List<TeamStatsDto> getTeamStats();

        @Query("""
                    select new com.careerit.iplstats.dto.RoleStatsDto(p.role,sum(p.amount),count(*)) 
                    from Player p 
                    group by p.role order by sum(p.amount) desc
                """)
        List<RoleStatsDto> getRoleStats();

        @Query("""
                  select new com.careerit.iplstats.dto.PlayerDto(p.id,p.name,p.role,p.teamName,p.teamLabel,p.amount) 
                  from Player p where p.teamLabel=:teamLabel order by p.amount desc
                """)
        List<PlayerDto> getPlayers(@Param("teamLabel") String teamLabel);

        @Query(value = """
                  select id,name,role,amount,teamName,teamLabel from (
                  select
                  	id,name,player_role as role,amount,team_name as teamName,team_label as teamLabel,dense_rank()
                  	over(partition by player_role order by amount desc) as rank from player)t where t.rank=1;
                """,nativeQuery = true)
        List<IPlayerDto> getMaxPaidPlayersOfEachRole();
        @Query(value = """
                  select id,name,role,amount,teamName,teamLabel from (
                  select
                  	id,name,player_role as role,amount,team_name as teamName,team_label as teamLabel,dense_rank()
                  	over(order by amount desc) as rank from player)t where t.rank= :n
                """,nativeQuery = true)
        List<IPlayerDto> findTopNthHeightPaidPlayers(@Param("n") int n);
}