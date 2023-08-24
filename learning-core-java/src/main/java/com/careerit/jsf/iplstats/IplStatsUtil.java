package com.careerit.jsf.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.List;

public final class IplStatsUtil {

        private static final String FILE_NAME="/player_details.json";

        @SneakyThrows
        public static List<Player> loadPlayerDetails(){
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Player>> type = new TypeReference<List<Player>>() {};
            return objectMapper.readValue(IplStatsUtil.class.getResourceAsStream(FILE_NAME),type);
        }
}
