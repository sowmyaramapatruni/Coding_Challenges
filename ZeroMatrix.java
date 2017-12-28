import java.util.*;
public class ZeroMatrix {
    public static int[][] arr;
    public static void printMatrix(){
        int n = arr.length;
	for(int i = 0; i< n; i++){
	    for(int j = 0; j < arr[i].length; j++){
	        System.out.print(arr[i][j] + "  ");
	    }
	    System.out.println();
	}
    }
    public static void makeRowZero(int row){
        int n = arr[row].length;
	for (int i = 0;i < n; i++){
	    arr[row][i] = 0;
	}
    }
    public static void makeColumnZero(int col){
        int m = arr.length;
        for (int i = 0;i < m; i++){
            arr[i][col] = 0;
        }
    }

    public static void MatrixZeroOperation(){
        int m = arr.length;
	ArrayList<Integer> rowList = new ArrayList<Integer>();
	ArrayList<Integer> colList = new ArrayList<Integer>();
        for (int i =0; i< m; i++){
	    for (int j =0; j< arr[i].length; j++){
	        //check for zeros
		if(arr[i][j] == 0){
		    rowList.add(i);
		    colList.add(j);
		}
	    }
	}
        for (int row: rowList){
	    makeRowZero(row);
	}
	for (int col: colList){
		makeColumnZero(col);
	}
    }
    public static void main(String[] args){
        //construct matrix
	arr = new int[3][3];
	arr[0][0] = 1;
	arr[0][1] = 0;
	arr[0][2] = 3;
	arr[1][0] = 4;
	arr[1][1] = 5;
	arr[1][2] = 6;
	arr[2][0] = 7;
	arr[2][1] = 8;
	arr[2][2] = 9;

	//print matrix
	printMatrix();
	
	//call matrixOperation method
	MatrixZeroOperation();

	System.out.println("After zero operation:");
	printMatrix();
	
	
    }
}
