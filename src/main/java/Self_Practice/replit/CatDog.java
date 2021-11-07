package replit;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
 */

public class CatDog {

	public static void main(String[] args) {

		int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = "catdogcatdog";
	    
	    int i =0;
	    do {
	    	i = word.indexOf("cat",i);
	    	if (i>=0) {
	    		countOfCats ++;
	    		i +=3;
	    	}
	    } while (i>=0);
	    
	    i =0;
	    do {
	    	i = word.indexOf("dog",i);
	    	if (i>=0) {
	    		countOfDogs ++;
	    		i +=3;
	    	}
	    } while (i>=0);
	System.out.println(countOfCats == countOfDogs ? true : false);
		
	}

}
