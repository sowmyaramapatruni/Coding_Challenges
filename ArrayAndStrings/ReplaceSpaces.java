import java.util.*;

public class ReplaceSpaces{

    public ReplaceSpaces(){}
    
    public static String solveMe(String st, int len){
        int totalLen = st.length();
        char[] charArr = new char[totalLen];
        int actLen = len;
        int count = 0, index = 0;
        while(count < actLen){
            char c = st.charAt(count);
            if (c != ' ') {
                charArr[index] = c;
		index++;
            } else{
	        charArr[index++] = '%';
	        charArr[index++] = '2';
	        charArr[index++] = '0';
	    }
	    count++;
        }
        String result = new String(charArr);
        return result;
    }

    public static void main(String[] args){
        String input = "Mr John Smith    ";

        //Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        //int actLen = sc.nextInt();
        int actLen = 13;
        String result = solveMe(input, actLen);
        System.out.println(result);
    }

}
