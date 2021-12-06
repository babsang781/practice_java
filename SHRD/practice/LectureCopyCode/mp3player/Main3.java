import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cnt = 0;
		MP3Player mp3 = new MP3Player(); // 음악 재생 객체

		// 음악 저장공간 ArrayList 생성하기
		ArrayList<Music> musicList = new ArrayList<Music>();

//		Music music1 = new Music("깡", "Rain",100);
//		Music music2 = new Music("NO ONE", "이하이",120);
//		Music music3 = new Music("FANCY", "TWICE",110);
//		Music music4 = new Music("Ring Ding Dong", "SHINee",120);
//		musicList.add(music1);
//		musicList.add(music2);
//		musicList.add(music3);
//		musicList.add(music4);
		MusicPlayer player = new MusicPlayer();
		// 수정 후
		musicList.add(new Music("NO ONE", "이하이", 200, "C://music/이하이 - NO ONE.mp3"));
		musicList.add(new Music("FANCY", "TWICE", 180, "C://music/TWICE - FANCY.mp3"));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));

		while (n != 5) {

			System.out.print("1.재생, 2.정지, 3.다음곡, 4.이전곡, 5 종료 >> ");
			n = sc.nextInt();

			switch (n) {
			case 1: // 재생>> 깡, Rain, 1분 40초
				if (mp3.isPlaying()) {
					musicList.get(cnt).show();
				} else {
					musicList.get(cnt).show();
//					mp3.play(musicList.get(cnt).getPath());
					
					player.play();
				}

				break;

			case 2:// 정지
				System.out.println("=== 음악 정지 ===");
				mp3.stop();
				break;

			case 3:// 다음곡
				player.nextPlay();
				musicList.get(cnt).show();

				break;

			case 4:// 이전곡
				if (mp3.isPlaying()) { // mp3 작동중인지 아닌지 boolean 으로 반환
					mp3.stop();
				}
				cnt--;
				if (cnt < 0) {
					cnt = musicList.size() - 1;
					System.out.print("===마지막 곡으로 돌아갑니다===");
				}
				musicList.get(cnt).show();
				mp3.play(musicList.get(cnt).getPath());
				break;

			case 5:// 종료
				System.out.println("프로그램 종료");
			}
		}
		sc.close();
	}
}
