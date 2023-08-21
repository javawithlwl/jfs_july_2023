package com.careerit.jsf.iplstats;

import java.util.List;
import java.util.Map;

public interface IplStatService {
        List<String> getTeamNames();
        List<Player> getPlayersByTeamName(String teamName);
        List<Player> getPlayersByRole(String role);
        List<TeamStatsDto> getTeamStats();
        List<Player> search(String str);
        List<RoleStatsDto> getPlayerRoleStats();
        List<Map<String,List<Player>>>  getMaxPaidPlayersByRole();
}
