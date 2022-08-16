public class Ex4_14 {
	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total=0;
		float average=0;
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				total = total + arr[i][j];
//				average = total / arr[i][j];
//			}
//		}
		
		// 풀이
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total += arr[i][j]; // arr[0][0], arr[0][1], ... arr[3][4]
				
			}
			cnt += arr[i].length;
		}
		average = (float)total / (arr.length * arr[0].length);	// = (float)total / cnt
		
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
