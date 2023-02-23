package ch05.lecture.p03matrix;

public class C01Matrix {
	public static void main(String[] args) {
		//2차원 배열(행렬)
		int[][] arr= new int[3][];
		
		System.out.println(arr.length);
		
		arr[0]=new int[] {1,3,5,7};
		arr[1]=new int[] {2,4,6,8};
		arr[2]=new int[] {9,10,11,12};
		for (int i = 0; i<3 ; i++) {
			for (int j=0; j<4 ; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
