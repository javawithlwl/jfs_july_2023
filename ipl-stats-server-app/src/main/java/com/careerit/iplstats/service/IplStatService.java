package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.*;

import java.util.List;
import java.util.Map;

public interface IplStatService {

        TeamLabelDto getTeamLabels();
        List<TeamStatsDto> getTeamStats();
        List<PlayerDto> getPlayers(String teamLabel);
        List<RoleStatsDto> getRoleStats();
        List<Map<String,List<IPlayerDto>>> getMaxPaidPlayerOfEachRole();
        List<IPlayerDto> getTopNthHeightPaidPlayers(int n);
}
