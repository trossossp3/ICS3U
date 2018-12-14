import java.util.Arrays;

public class scrap {
	public static void main(String[] args) {
		
		int[][] nums2d = {{1,2,3},{2,3,1},{3,1,2}};
		
		//display(nums2d);
		
		int[] row1 = nums2d[0];
	
		for(int i =0; i <row1.length;i++) {
			System.out.println(row1[i]);
		}
		
		
	}
	
	private static void display(int[][] arr2d) {
		for (int i=0; i < arr2d.length; i++){
			for (int j = 0; j < arr2d[i].length; j++){
				System.out.printf("%4d", arr2d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
