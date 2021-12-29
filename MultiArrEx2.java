import java.util.*;

public class MultiArrEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;
		int x = 0, y = 0;
		int num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		//int no = 0;
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j] = i*SIZE + j + 1;
				//bingo[i][j] = ++no;
			}
		}
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d�� ���ڸ� �Է�������.(����:0)>",SIZE*SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			//num = scanner.nextInt();
			outer:
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					if(bingo[i][j]==num) {
						bingo[i][j] = 0;
						break outer;
						
					}
				}
			}
		} while(num!=0);
	}
}