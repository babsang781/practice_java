import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cnt = 0;
		// ���� ������� ArrayList �����ϱ�
		ArrayList<Music> musicList = new ArrayList<Music>();

//		Music music1 = new Music("��", "Rain",100);
//		Music music2 = new Music("NO ONE", "������",120);
//		Music music3 = new Music("FANCY", "TWICE",110);
//		Music music4 = new Music("Ring Ding Dong", "SHINee",120);
//		musicList.add(music1);
//		musicList.add(music2);
//		musicList.add(music3);
//		musicList.add(music4);

		// ���� ��
		musicList.add(new Music("��", "Rain", 100));
		musicList.add(new Music("NO ONE", "������", 120));
		musicList.add(new Music("FANCY", "TWICE", 110));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 120));

		while (n != 5) {

			System.out.print("1.���, 2.����, 3.������, 4.������, 5 ���� >> ");
			n = sc.nextInt();
			switch (n) {

			case 2:// ����
				break;
			case 3:// ������
			case 4:// ������
				if (n == 3) {
					cnt++;
				} else if (n == 4) {
					cnt--;
				}
				if (cnt < 0) {
					cnt = musicList.size() - 1;
					System.out.print("===������ ������ ���ư��ϴ�===");
				}else if(cnt>=musicList.size()) {
					cnt=0;
					System.out.print("===ó�� ������ ���ư��ϴ�===");
				}
			case 1: // ���>> ��, Rain, 1�� 40��
				musicList.get(cnt).show();
				break;
			case 5:// ����
				System.out.println("���α׷� ����");
			}

		}

		sc.close();
	}

}
