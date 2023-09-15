package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.TeamStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player,Long> {

        @Query("select distinct p.teamName from Player p")
        List<String> selectTeamNames();

        @Query("""
                select new com.careerit.iplstats.dto.TeamStatsDto(p.teamName,sum(p.amount)) 
                  from Player p 
                  group by p.teamName order by sum(p.amount) desc
              """)
        List<TeamStatsDto> getTeamStats();
}
