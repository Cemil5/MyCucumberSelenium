import java.util.Locale;

public class Test2 {

    public static void main(String[] args) {
    // remove spaces and duplicates
        String str = "aaa lbl ddd klm cfg";

        System.out.println(distinctStr(str));
    }

    public static String distinctStr(String str){
        String result = "";
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        for (int i=0; i<str.length();i++){
            String temp = ""+str.charAt(i);
            if (!result.contains(temp)){
                result += temp;
            }
        }
        return result;
    }


}
