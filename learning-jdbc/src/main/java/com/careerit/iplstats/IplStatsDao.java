package com.careerit.iplstats;

import com.careerit.iplstats.domain.Player;

import java.util.List;

public interface IplStatsDao {
        double totalAmountSpentBy(String teamName);
        List<String> teamNames();
        List<Player> getMaxPaidPlayers(String teamName);
}
