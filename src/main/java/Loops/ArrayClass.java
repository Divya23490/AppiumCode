package Loops;

public class ArrayClass {

	public static void main(String[] args) {
//		int arr[]=new int[5];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		for(int i=0;i<=arr.length;i++){
//			System.out.println(arr[i]);
//		}
		int [][] array;
		int array1[][];
		int [] array2[];
		
//		int array3[][]=new int [3][3];
		int[][] array3={{10,2,6},{5,6,9},{7,8,10}};
		for(int i=0;i<array3.length;i++)//rows
			for(int j=0;j<array3.length;j++){
				System.out.println(array3[i][j]);
			}
		
		

	}

}
