package com.careerit.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CsvReaderUtil {

    @SneakyThrows
    public List<Map<String, Object>> readDataFromFile() {
        String fileName = "user_data.csv";
        Reader in = new FileReader(CsvReaderUtil.class.getClassLoader().getResource(fileName).getFile());
        String[] HEADERS = {"name", "email", "mobile"};
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(HEADERS)
                .setSkipHeaderRecord(true)
                .build();
        Iterable<CSVRecord> csvParser = csvFormat.parse(in);
        List<Map<String, Object>> list = new ArrayList<>();
        for (CSVRecord record : csvParser) {
            Map<String, Object> map = new HashMap<>();
            for (String name : HEADERS) {
                map.put(name, record.get(name));
            }
            list.add(map);
        }
        return list;
    }

    @SneakyThrows
    public List<AppUser> loadAppUsers() {
        List<Map<String, Object>> list = readDataFromFile();
        ObjectMapper objectMapper = new ObjectMapper();
        return list.stream().map(ele -> objectMapper.convertValue(ele, AppUser.class)).toList();
    }

    @SneakyThrows
    public void writeCsvData(List<AppUser> appUsers) {
        final String fileName = "user.csv";
        try {
            String tempDir = FileUtils.getTempDirectoryPath();
            String filePath = tempDir +"/"+ fileName;
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));
            System.out.println("File path : "+filePath);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                    .withHeader("Name", "Email", "Mobile"));
            for (AppUser user : appUsers) {
                csvPrinter.printRecord(user.getName(), user.getEmail(), user.getMobile());
            }
            csvPrinter.flush();
            writer.close();
            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Add method append data

    public static void main(String[] args) {

        CsvReaderUtil obj = new CsvReaderUtil();
        List<Map<String, Object>> list = obj.readDataFromFile();
        System.out.println(list);

        List<AppUser> appUsers = obj.loadAppUsers();
        System.out.println(appUsers);
        obj.writeCsvData(appUsers);
    }
}
