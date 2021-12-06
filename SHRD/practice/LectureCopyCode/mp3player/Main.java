import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		// 음악 저장공간 ArrayList 생성하기
		MusicPlayer player = new MusicPlayer();

		while (n != 5) {

			System.out.print("1.재생, 2.정지, 3.다음곡, 4.이전곡, 5 종료 >> ");
			n = sc.nextInt();

			switch (n) {
			case 1: // 재생
				player.play();
				break;

			case 2:// 정지
				player.stop();
				break;

			case 3:// 다음곡
				player.nextPlay();
				break;

			case 4:// 이전곡
				player.beforePlay();
				break;
				
			case 5:// 종료
				System.out.println("프로그램 종료");
			}
		}
		sc.close();
	}
}
