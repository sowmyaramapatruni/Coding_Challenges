import java.util.Random;

public class MatrixRotation {
    public static void rotateMatrix(int[][] arr){
        int n = arr.length;
	int levels = n/2;
        //loop for levels
	for(int level = 0; level<levels; level++){
	    //swap elements
	    int first = level;
	    int last  = n-1-level;
	    for (int i = first; i< last; i++){
		int offset = i - first;
	        int temp = arr[first][i];
		arr[first][i] = arr[last-offset][first];
		
		arr[last-offset][first] = arr[last][last-offset];
		
		arr[last][last-offset] = arr[i][last];
		
		arr[i][last] = temp;
	    }
	}
        System.out.println("Matrix After Rotation:");
        printMatrix(arr);	
    
    }

    public static void printMatrix(int[][] arr){
        int size = arr.length;
	for (int i = 0; i < size; i++){
	    for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
	    }
	    System.out.println();
        }
    }
    public static void main(String[] args){
	Random rand = new Random();
        //define a matrix
	int[][] mat = new int[5][5];
	for(int i = 0; i < mat.length; i++){
	    for(int j = 0; j < mat.length; j++){
	        mat[i][j] = rand.nextInt(50);
	    }
	}
	printMatrix(mat);
	//call rotateMatrix
	rotateMatrix(mat);
    }
}
