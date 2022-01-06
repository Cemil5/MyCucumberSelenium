public class printFormat {
    public static void main(String[] args) {
        String s1="Test";
        int x= 15;
        System.out.printf("%-15s%03d%n", s1, x);
        System.out.printf("'%-15s%05d' %n", s1, x);
        System.out.printf("'%03d'", s1);
        System.out.printf("'%03d'", x);
       /* System.out.printf("'%-15s' %n", s1 ("%03d"), x));
        System.out.format("%03d", x);*/
    }
}
