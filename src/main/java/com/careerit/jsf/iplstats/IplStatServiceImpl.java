package com.careerit.jsf.iplstats;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class IplStatServiceImpl implements IplStatService {

    private List<Player> players;

    public IplStatServiceImpl() {
        this.players = IplStatsUtil.loadPlayerDetails();
    }

    @Override
    public List<String> getTeamNames() {
        if (CollectionUtils.isNotEmpty(players)) {
            return players.stream().map(Player::getTeamName).distinct().toList();
        }
        return List.of();
    }

    @Override
    public List<Player> getPlayersByTeamName(String teamName) {
        return null;
    }

    @Override
    public List<Player> getPlayersByRole(String role) {
        return null;
    }

    @Override
    public List<TeamStatsDto> getTeamStats() {
        Map<String, List<Player>> map = players.stream().collect(Collectors.groupingBy(Player::getTeamName));
        List<TeamStatsDto> teamStatsList = new ArrayList<>();
        map.forEach((key,value)->{
            DoubleSummaryStatistics summaryStats = value.stream().collect(Collectors.summarizingDouble(Player::getAmount));
            teamStatsList.add(TeamStatsDto.builder()
                    .teamName(key)
                    .avgAmount(summaryStats.getAverage())
                    .maxAmount( summaryStats.getMax())
                    .minAmount(summaryStats.getMin())
                    .playerCount(summaryStats.getCount())
                    .totalAmount(summaryStats.getSum())
                    .build());
        });
        return teamStatsList;
    }

    @Override
    public List<Player> search(String str) {
       return null;
    }

    @Override
    public List<RoleStatsDto> getPlayerRoleStats() {
        return null;
    }

    @Override
    public List<Map<String, List<Player>>> getMaxPaidPlayersByRole() {
        return null;
    }
}
