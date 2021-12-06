import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cnt = 0;
		MP3Player mp3 = new MP3Player(); // ���� ��� ��ü

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
		MusicPlayer player = new MusicPlayer();
		// ���� ��
		musicList.add(new Music("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3"));
		musicList.add(new Music("FANCY", "TWICE", 180, "C://music/TWICE - FANCY.mp3"));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));

		while (n != 5) {

			System.out.print("1.���, 2.����, 3.������, 4.������, 5 ���� >> ");
			n = sc.nextInt();

			switch (n) {
			case 1: // ���>> ��, Rain, 1�� 40��
				if (mp3.isPlaying()) {
					musicList.get(cnt).show();
				} else {
					musicList.get(cnt).show();
//					mp3.play(musicList.get(cnt).getPath());
					
					player.play();
				}

				break;

			case 2:// ����
				System.out.println("=== ���� ���� ===");
				mp3.stop();
				break;

			case 3:// ������
				player.nextPlay();
				musicList.get(cnt).show();

				break;

			case 4:// ������
				if (mp3.isPlaying()) { // mp3 �۵������� �ƴ��� boolean ���� ��ȯ
					mp3.stop();
				}
				cnt--;
				if (cnt < 0) {
					cnt = musicList.size() - 1;
					System.out.print("===������ ������ ���ư��ϴ�===");
				}
				musicList.get(cnt).show();
				mp3.play(musicList.get(cnt).getPath());
				break;

			case 5:// ����
				System.out.println("���α׷� ����");
			}
		}
		sc.close();
	}
}
