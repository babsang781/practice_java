import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		// ���� ������� ArrayList �����ϱ�
		MusicPlayer player = new MusicPlayer();

		while (n != 5) {

			System.out.print("1.���, 2.����, 3.������, 4.������, 5 ���� >> ");
			n = sc.nextInt();

			switch (n) {
			case 1: // ���
				player.play();
				break;

			case 2:// ����
				player.stop();
				break;

			case 3:// ������
				player.nextPlay();
				break;

			case 4:// ������
				player.beforePlay();
				break;
				
			case 5:// ����
				System.out.println("���α׷� ����");
			}
		}
		sc.close();
	}
}
