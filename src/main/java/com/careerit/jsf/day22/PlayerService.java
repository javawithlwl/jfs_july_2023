package com.careerit.jsf.day22;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
class TeamDetailsDto{
    @JsonProperty("label")
    private String teamName;
    private List<PlayerDto> players;
}
@Getter
@Setter
class PlayerDto{
    private String name;
    private String role;
    private double amount;
}
public class PlayerService {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<TeamDetailsDto> teamDetailsDtoList =
                objectMapper.readValue(PlayerService.class.getResourceAsStream("/team_details.json"),
                        new TypeReference<List<TeamDetailsDto>>() {});
        List<PlayerDetails> playerDetails = new ArrayList<>();
        for(TeamDetailsDto teamDetailsDto: teamDetailsDtoList){
            for(PlayerDto playerDto: teamDetailsDto.getPlayers()){
                PlayerDetails player = PlayerDetails.builder()
                        .name(playerDto.getName())
                        .role(playerDto.getRole())
                        .teamName(teamDetailsDto.getTeamName())
                        .amount(playerDto.getAmount())
                        .build();
                playerDetails.add(player);
            }
        }
        System.out.println("Total players count :"+playerDetails.size());
        objectMapper.writeValue(new File("player_details.json"),playerDetails);
        // Find max paid player(s)
        // Find total amount spent on players
        // Show only player names
        // Show the player details of given team
        double totalAmount = 0;
        for(PlayerDetails player:playerDetails){
            totalAmount += player.getAmount();
        }
        System.out.println("Total amount spent on players :"+String.format("%.2f",totalAmount));
    }
}
