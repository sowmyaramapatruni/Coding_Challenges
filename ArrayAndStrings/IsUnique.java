import java.util.*;

public class IsUnique {
    public IsUnique(){}
    
    public static boolean solveMe(String st){
        int checker = 0;
        boolean[] charset = new boolean[128];
        int len = st.length();
        if(len > 128) return false;
        for(int i = 0; i < len; i++){
            int a = st.charAt(i);
            if (charset[a]){
                return false;
            }
            else {
                charset[a] = true;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //String input = "abcdefghijklmnopqrstuvwxyz";
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
        boolean result = solveMe(input);
        System.out.println(result);
    }
}
