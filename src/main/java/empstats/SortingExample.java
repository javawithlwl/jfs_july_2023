package empstats;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1005);
        list.add(1003);
        list.add(1004);
        list.add(1002);

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
        System.out.println(sortedList);
    }
}
