import java.util.Locale;

public class Test1 {

    public static void main(String[] args) {
        String str = "Ankara";
        System.out.println(filterVowels(str));
    }

    public static String filterVowels(String str){
        String result = "";
        str = str.toLowerCase();
        result = str.replaceAll("a", "");

        return result;
    }
}
