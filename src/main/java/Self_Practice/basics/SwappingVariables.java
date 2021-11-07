package basics;

import java.util.*;  
class SwappingVariables {  
    public static void main(String[] args) {  
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("\n before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("\n After swapping: "+x +"   " + y);  
       System.out.println( );  
    }    
}  
