/**
 * Check if given strings are permutations of one another
 * If a string can be rearraged in to another given string they are
 * permutations of each other
 * */
import java.util.*;

public class CheckPermutation{
    public CheckPermutation(){}

    public static boolean solveMeUsingHashTable(String st1, String st2){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	//check if both are same size
	if (st1.length() != st2.length()) return false;
	//populate hashtable using st1
	for (int i = 0; i < st1.length(); i++){
	    char c = st1.charAt(i);
	    if (map.containsKey(c)) map.put(c,map.get(c)+1);
	    else map.put(c,1);
	}
        //check if the strings are same
	for (int j= 0; j < st2.length(); j++){
	    char c2 = st2.charAt(j);
	    if( !map.containsKey(c2) || map.get(c2) < 1 ) return false;
	    else map.put(c2, map.get(c2)-1);
	}	
        return true;	
    }

    public static boolean solveMeUsingCharArray(String st1, String st2){
        if (st1.length() != st2.length()) return false;
        int[] charArr = new int[128];

        for(int i = 0; i < st1.length(); i++){
            charArr[st1.charAt(i)]++;
        }

        for(int j = 0; j < st2.length(); j++){
            charArr[st2.charAt(j)]-- ;
            if(charArr[st2.charAt(j)] < 0) return false;
        }

        return true;
    }


    public static void main(String[] args){
    	//read input
	Scanner sc = new Scanner(System.in);
	String st1, st2;
	st1 = sc.nextLine();
	st2 = sc.nextLine();
	//boolean result = solveMeUsingHashTable(st1, st2);
	boolean result = solveMeUsingCharArray(st1, st2);
	System.out.println(result);
    }
}

