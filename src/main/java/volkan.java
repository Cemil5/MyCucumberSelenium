import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class volkan {

    public static void main(String[] args) {

        List<Integer> temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        temp.add(4);
        temp.add(2);
        temp.add(2);

        System.out.println(getPlanetToDestroy(temp));

    }

    public static int getPlanetToDestroy(List<Integer> planets){
        int res = 0;


        List<Integer> temp;
        temp = planets;


        int even = 0;
        int odd =0;
        int j=0;
        int element=0;
do{
    even = 0;
    odd =0;
    for (int i = 0; i < temp.size(); i++) {
        if (i % 2 != 0) {
            odd += temp.get(i);
        } else {
            even += temp.get(i);
        }
    }
    System.out.println(odd + " " + even);
    if (odd == even) {
        return res;
    } else {
        System.out.println("j = " + j);
        element = temp.get(j);
        if (j>0) {
            temp.add(j - 1, element);
        }
        res = j;
        temp.remove(j);
        j++;
    }
} while (j<temp.size());

        if (odd != even) {
            res = -1;
        }

        return res;
    }

}
