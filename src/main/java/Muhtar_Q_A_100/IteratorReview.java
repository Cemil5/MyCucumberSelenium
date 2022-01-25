package Muhtar_Q_A_100;

import java.util.*;
import java.util.Map;

public class IteratorReview {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(100,100,100,200,300,200,400,100));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(100,100,100,200,300,200,400,100));

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)<200){
                list1.remove(i);
                i--;
            }
        }
        System.out.println("list1 for loop = " + list1);    // [200, 300, 200, 400]

        list1.removeIf(integer -> integer < 300);
        System.out.println("list1_ removeIf = " + list1);   // [300, 400]

        Iterator<Integer> it2 = list2.iterator();			// we set the pointer again

        while (it2.hasNext()){
            int val = it2.next();
            if(val <300){
                System.out.println(val);
                it2.remove();
            }
        }
        System.out.println("list2 while loop = " + list2);  // [300, 400]


        int[] nums = {100,100,100,200,300,200,400,100};
        Iterator<Integer> it3 = Arrays.stream(nums).iterator();
        while (it3.hasNext()){
            int val = it3.next();
            if (val>300){
                System.out.println(val);
               // it3.remove(); // throws java.lang.UnsupportedOperationException
            }
        }
        System.out.println("nums Array = " + Arrays.toString(nums)); // [100, 100, 100, 200, 300, 200, 400, 100]

        System.out.println("\n\t iterating with map");
        Map<String, String> dataMap	= new HashMap<>();
        dataMap.put("url", "qa3.vytrack.com");   dataMap.put("username", "user66");
        dataMap.put("password", "abc66");        dataMap.put("browser", "chrome");
        dataMap.put("truckdriver", "Bob");       dataMap.put("storemanager", "John");


        // using Collection.removeIf
        dataMap.keySet().removeIf(o -> o.equals("truckdriver"));
        System.out.println(" removeIf +++++++ KEY | VALUES +++++++");
        for (String key : dataMap.keySet()) {
            System.out.println(key + " = " + dataMap.get(key));
        }

        Iterator<String> it4 = dataMap.keySet().iterator();
        while (it4.hasNext()){
            if (it4.next().equals("storemanager")){
                it4.remove();
            }
        }
        System.out.println(" while +++++++ KEY | VALUES +++++++");
        for (String key : dataMap.keySet()) {
            System.out.println(key + " = " + dataMap.get(key));
        }

    }


}
