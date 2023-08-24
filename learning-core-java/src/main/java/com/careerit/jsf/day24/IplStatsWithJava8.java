package com.careerit.jsf.day24;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IplStatsWithJava8 {

    public static void main(String[] args) throws IOException {
        // To read player details
        ObjectMapper objectMapper = new ObjectMapper();
        List<Player> players = objectMapper.readValue(IplStatsWithJava8.class.getResourceAsStream("/player_details.json"),
                new TypeReference<List<Player>>() {
                });
        System.out.println("Total player count is :" + players.size());

        // Get only team names

        List<String> teamNames = getTeamNames(players);
        System.out.println(teamNames);

        List<String> playersOfRCB = getPlayerNameOf("RCB",players);
        System.out.println(playersOfRCB);

    }

    // Ensure team names are unique
    private static List<String> getTeamNames(List<Player> players) {
//            List<String> teamNames = new ArrayList<>();
//            for(Player player:players){
//                String teamName = player.getTeamName();
//                if(!teamNames.contains(teamName)){
//                    teamNames.add(teamName);
//                }
//            }
//            return teamNames;
        return players.stream()
                .map(Player::getTeamName)
                .distinct()
                .toList();
    }

    // Get player name of the given team
    private static List<String> getPlayerNameOf(String teamName,List<Player> players){
        return  players.stream()
                .filter(t->t.getTeamName().equals(teamName))
                .map(Player::getName)
                .toList();
    }

    // Get total amount spent by given team

    private static double getTotalAmount(String teamName,List<Player> players){
       return  players.stream()
                .filter(t->t.getTeamName().equals(teamName))
                .mapToDouble(Player::getAmount)
                .sum();
    }

    // Get count of players for the given team and role
    private static long countOf(String teamName,String role,List<Player> players){
        // TODO
        return 0;
    }

    // Get max amount of the given team
    private static double maxAmount(String teamName,List<Player> players){
        // TODO
        return 0;
    }

    // Get max paid player(s) of the given team
    private static List<Player> getMaxPaidPlayers(String teamName,List<Player> players){
        // TODO
        return null;
    }
    // Get team stats
    private static List<TeamStatDto> getTeamAmountStats(List<Player> players){
        // TODO
        return null;
    }
}
