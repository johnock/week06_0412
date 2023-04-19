package test.array;

import java.util.Iterator;

public class DyanamicArray {

	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[3];
			int n = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++;
				
			}
		
		}
	for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.err.println();
		}
	}
	}



