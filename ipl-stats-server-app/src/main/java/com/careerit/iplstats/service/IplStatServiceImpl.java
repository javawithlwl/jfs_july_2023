package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.*;
import com.careerit.iplstats.repo.PlayerRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class IplStatServiceImpl implements  IplStatService{

    private final PlayerRepo playerRepo;
    @Override
    public TeamLabelDto getTeamLabels() {
        List<String> teamNames = playerRepo.selectTeamNames();
        log.info("Total team count : {} ",teamNames.size());
        TeamLabelDto teamLabelDto = new TeamLabelDto();
        teamLabelDto.setTeamNames(teamNames);
        return teamLabelDto;
    }

    @Override
    public List<TeamStatsDto> getTeamStats() {
        return playerRepo.getTeamStats();
    }

    @Override
    public List<PlayerDto> getPlayers(String teamLabel) {
        Assert.notNull(teamLabel,"Team label should not be null");
        return playerRepo.getPlayers(teamLabel);
    }

    @Override
    public List<RoleStatsDto> getRoleStats() {
        return playerRepo.getRoleStats();
    }

    @Override
    public List<Map<String, List<IPlayerDto>>> getMaxPaidPlayerOfEachRole() {
        List<IPlayerDto> players = playerRepo.getMaxPaidPlayersOfEachRole();
        return players.stream().collect(Collectors.groupingBy(IPlayerDto::getRole)).entrySet().stream().map(entry->{
            return Map.of(entry.getKey(),entry.getValue());
        }).collect(Collectors.toList());
    }

    @Override
    public List<IPlayerDto> getTopNthHeightPaidPlayers(int n) {
        return playerRepo.findTopNthHeightPaidPlayers(n);
    }
}
