package InterviewCodingTasks;

import io.cucumber.java.sl.In;

import java.util.*;

public class Map_SortByValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("ab", 3);
        map.put("cc", 2);
        map.put("dd", 4);
        map.put("ee",1);

        System.out.println("sortByValue(map) = " + sortByValue(map));

    }

    /*
        Write a method that can sort the map by values (ascending order)
     */

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}
