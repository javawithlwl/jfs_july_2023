package com.careerit.jsf.iplstats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IplStatsUtilTest {

    @Test
    void loadPlayerTest() {
        List<Player> playerList = IplStatsUtil.loadPlayerDetails();
        System.out.println("Players count is "+playerList.size());
        Assertions.assertEquals(188, playerList.size());
    }
}
