public class temp {
    public static boolean solution(String st1, String st2){
	if (st1.length() != st2.length()){
            return false;	    
	}
	int[] arr = new int[128];
	for (int i =0; i<st1.length(); i++){
	    int index = st1.charAt(i);
	    arr[index]++;
	}

	for (int j =0; j<st1.length(); j++){
	    int index2 = st2.charAt(j);
	    if (arr[index2] == 0){
	        return false;
	    } else {
	        arr[index2]--;
	    }
	}
	return true;
     }
     public static void main(String[] args){

	 String st1 = "abcda";
         String st2 = "dcaxa";
	 /**
         boolean res = solution(st1, st2);
	 System.out.println(res);
	 */

	 char c = 'z';
	 int res = Character.getNumericValue('z');
	 System.out.println(res);
	 int res2 = c - 'a';
	 System.out.println(res2);

     }
    
}
