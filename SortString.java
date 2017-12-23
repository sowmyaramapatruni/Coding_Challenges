import java.util.*;
public class SortString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	String st1 = sc.next();
	char[] content = st1.toCharArray();
	java.util.Arrays.sort(content);
	String result = new String(content);
	System.out.println(result);
    }
}
