/**
 * Check if given strings are permutations of one another
 * If a string can be rearraged in to another given string they are
 * permutations of each other
 * */
import java.util.*;

public class CheckPalindrome{
    public CheckPalindrome(){}

    public static boolean solveMeUsingHashTable(String st1){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	int count = 0;
	//check if both are same size
	//populate hashtable using st1
	String str = st1.replaceAll(" ","").toLowerCase();

	for (int i = 0; i < str.length(); i++){
	    char c = str.charAt(i);
	    if (map.containsKey(c)) map.put(c,map.get(c)+1);
	    else map.put(c,1);
	}
        //check if the strings are same
	for (Integer value : map.values()){
             if (value == 1) {
                 count++;
	     }
             if (count > 2) {
		 return false;
             }

	}
        return true;	
	}


    public static void main(String[] args){
    	//read input
	Scanner sc = new Scanner(System.in);
	String st1, st2;
	st1 = sc.nextLine();
	boolean result = solveMeUsingHashTable(st1);
	System.out.println(result);
    }
}
