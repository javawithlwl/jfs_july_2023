package com.careerit.jsf.iplstats;

import java.util.List;
import java.util.Scanner;

public class IplStatsManager {

    public static void main(String[] args) {

        System.out.println("Welcome to IPL stats application");
        Scanner sc = new Scanner(System.in);
        IplStatService iplStatService = new IplStatServiceImpl();
        while(true){
            System.out.println("""
                        1. Team names
                        2. Team stats
                        3. Role stats
                        4. Search
                        5. Max paid players by role
                        6. Players of given team
                        7. Exit
                    """);
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch (ch){
                case 1 -> {
                    List<String> teamNames = iplStatService.getTeamNames();
                    System.out.println(teamNames);
                }
                case 2 ->{
                    List<TeamStatsDto> teamStatsList = iplStatService.getTeamStats();
                    teamStatsList.forEach(System.out::println);
                }
                case 3 ->{

                }
                case 4 ->{

                }
                case 5 ->{

                }
                case 6 ->{

                }
                case 7 ->{
                    System.out.println("Thank you");
                    System.exit(0);
                }
                default -> System.out.println("Please enter valid choice(1-7) only");
            };
        }
    }
}
