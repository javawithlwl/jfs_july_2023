package com.careerit.jsf.iplstats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IplStatServiceTest {
        @Test
        void getTeamNamesTest(){
            IplStatService iplStatService = new IplStatServiceImpl();
            int expected = 8;
            int actual = iplStatService.getTeamNames().size();
            Assertions.assertEquals(expected,actual);
        }


}
