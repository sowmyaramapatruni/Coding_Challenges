import java.util.*;
public class StepCount {

    public static int countSteps(int n){
        if (n == 3) return 3;
	else if (n == 2) return 2;
	else if (n == 1) return 1;

	int[] M = new int[n];
        M[1] = 1;
	M[2] = 2;
	M[3] = 3;

	for(int i = 4; i<n; i++){
	    M[i] = M[i-1] + M[i-2] + M[i-3];
	}
        return M[n-1] + M[n-2] + M[n-3];
    }
    public static void main(String[] args){
        //read input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int n = sc.nextInt();

	int result = countSteps(n);
	System.out.println(result);
    }
}
