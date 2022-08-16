
public class MineSweeper {
	public static void main(String[] args) {
		// 10*10 배열 생성
		boolean[][] board = new boolean[10][10];
		
		// 지뢰인지 아닌지 판별해서 배열값 채우기
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(Math.random()<0.3)
					board[i][j] = true;
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0; j<10;j++) {
				if(board[i][j] == true)
					System.out.print("# ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}//for
	}//main
}