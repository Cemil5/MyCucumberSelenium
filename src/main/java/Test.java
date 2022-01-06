import io.cucumber.java.bs.I;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        System.out.println("perArray(\"pcmbzpcmbzpczz\") = " + perArray("pcmbzpcmbzpczz"));
        System.out.println("perArrayList(\"pcmbzpcmbzpczz\") = " + perArrayList("pcmbzpcmbzpczz"));

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("a", "b","c", "a", "b","a", "c", "c","c"));
        System.out.println("maxVegetable(list) = " + maxVegetable(list));

    }

    /* You have a list of fruits which some of them repeats. How would you write a method which will return a
    fruit that repeats the most?    */

    public static String maxVegetable (ArrayList<String> list){
        String result="";
        Map<String , Integer> map = new HashMap<>();

        for (String s : list) {
            if (!map.containsKey(s)){
                map.put(s, 1);
            } else {
                map.replace(s, map.get(s)+1);
            }
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
            if (max<entry.getValue()){
                max = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (max==entry.getValue()){
                result = entry.getKey();
            }
        }
       return result;
    }
    // Collections.frequency(list, Collections.max(list))

    private static int perArray(String skills){
        int result=0;
        int p=0, c=0, m=0,b=0,z=0;
        int [] nums = new int[5];

        for (int i=0; i<skills.length();i++){

            switch (skills.charAt(i)){
                case 'p' :
                    p++;
                    nums[0]++;
                    break;
                case 'c' :
                    c++;
                    nums[1]++;
                    break;
                case 'm' :
                    m++;
                    nums[2]++;
                    break;
                case 'b' :
                    b++;
                    nums[3]++;
                    break;
                case 'z' :
                    z++;
                    nums[4]++;
                    break;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return nums[0];
    }

    private static int per(String skills){
        int result = 0;
        int p=0, c=0, m=0,b=0,z=0;

        for (int i=0; i<skills.length();i++){

            switch (skills.charAt(i)){
                case 'p' :
                    p++;
                    break;
                case 'c' :
                    c++;
                    break;
                case 'm' :
                    m++;
                    break;
                case 'b' :
                    b++;
                    break;
                case 'z' :
                    z++;
                    break;
            }
        }
        int[] nums = {p,c,m,b,z};
        //  Arrays.sort(nums);
        return Arrays.stream(nums).min().getAsInt();
    }


    private static int perArrayList(String skills){
        int p=0, c=0, m=0,b=0,z=0;
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(0,0);
        list.add(1,0);
        list.add(2,0);
        list.add(3,0);
        list.add(4,0);

        System.out.println("list = " + list);

        for (int i=0; i<skills.length();i++){

            switch (skills.charAt(i)){
                case 'p' :
                    p++;
                    list.set(0, list.get(0) + 1);
                    break;
                case 'c' :
                    c++;
                    list.set(1, list.get(1) + 1);
                    break;
                case 'm' :
                    m++;
                    list.set(2, list.get(2) + 1);
                    break;
                case 'b' :
                    b++;
                    list.set(3, list.get(3) + 1);
                    break;
                case 'z' :
                    z++;
                    list.set(4, list.get(4) + 1);
                    break;
            }
        }
        System.out.println("list before sort = " + list);
        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
        System.out.println("list after sort = " + list);
        return list.get(0);
    }

    public static String winner(String erica, String bob){
        String result ="";
        int e =0;
        int b =0;

        for (int i=0; i<erica.length();i++){
            switch (erica.charAt(i)){
                case  'E' :
                    e++;
                    break;
                case  'M' :
                    e+=3;
                    break;
                case  'H' :
                    e+=5;
                    break;
            }
        }

        for (int i=0; i<bob.length();i++){
            switch (bob.charAt(i)){
                case  'E' :
                    b++;
                    break;
                case  'M' :
                    b+=3;
                    break;
                case  'H' :
                    b+=5;
                    break;
            }
        }

        if (e > b){
            result = "Erica";
        } else if (e==b){
            result = "Tie";
        } else {
            result = "Bob";
        }

        return result;
    }

}
