package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.StatsDto;

import java.util.List;

public interface IplStatsDao {
        double totalAmountSpentBy(String teamName);
        List<String> teamNames();
        List<Player> getMaxPaidPlayers(String teamName);
        List<StatsDto> getTeamStats();

}
