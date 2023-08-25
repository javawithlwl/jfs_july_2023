package com.careerit.cbook;

import org.junit.jupiter.api.Test;

import java.util.List;

public class UtilTest {
        @Test
        void generateSQL(){
            String tableName = "app_user";
            List<String> columns = List.of("name","email","mobile");
            List<List<String>> data = List.of(
                    List.of("manoj","manoj.pvn@gmail.com","9876543210"),
                    List.of("krish","krish.k@gmail.com","9876543211"),
                    List.of("charan","charan.c@gmail.com","9876543212"),
                    List.of("sai","sai.s@gmail.com","9876543213"),
                    List.of("ravi","ravi.r@gmail.com","9876543214"),
                    List.of("ram","ram.r@gmail.com","9876543215"),
                    List.of("kiran","kiran.k@gmail.com","9876543216"),
                    List.of("suresh","suresh.s@gmail.com","9876543217"),
                    List.of("ramesh","ramesh.r@gmail.com","9876543218"));

            String sql = "";
            for(List<String> list:data){
                List<String> dataList = list.stream().map(str -> "'" + str + "'").toList();
                sql += "insert into "+tableName+"("+String.join(",",columns)+") values("+String.join(",",dataList)+");\n";

            }
            System.out.println(sql);
        }

}
