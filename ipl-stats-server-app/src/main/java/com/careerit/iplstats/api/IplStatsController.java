package com.careerit.iplstats.api;

import com.careerit.iplstats.dto.*;
import com.careerit.iplstats.service.IplStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/iplstats")
@RequiredArgsConstructor
public class IplStatsController {

    private final IplStatService iplStatService;

    @GetMapping("/team-labels")
    public ResponseEntity<TeamLabelDto> getTeamLabels() {
        return ResponseEntity.ok(iplStatService.getTeamLabels());
    }

    @GetMapping("/team-stats")
    public ResponseEntity<List<TeamStatsDto>> getTeamStats() {
        return ResponseEntity.ok(iplStatService.getTeamStats());
    }

    @GetMapping("/role-stats")
    public ResponseEntity<List<RoleStatsDto>> getRoleStats() {
        return ResponseEntity.ok(iplStatService.getRoleStats());
    }

    @GetMapping("/role-max-paid-players")
    public ResponseEntity<List<Map<String, List<IPlayerDto>>>> getMaxPaidPlayerOfEachRole() {
        return ResponseEntity.ok(iplStatService.getMaxPaidPlayerOfEachRole());
    }

    @GetMapping("/top-nth-paid-players")
    public ResponseEntity<List<IPlayerDto>> getTopNthHeightPaidPlayers(@RequestParam(defaultValue = "1", required = false) int n) {
        return ResponseEntity.ok(iplStatService.getTopNthHeightPaidPlayers(n));
    }
}