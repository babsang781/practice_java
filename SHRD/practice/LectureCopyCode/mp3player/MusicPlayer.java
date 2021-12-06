import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	// 작동하는 기능 MVC 중 controller 부분을 작성
	// 재생, 정지, 이전곡, 다음곡, 종료
	int cnt = 0;
	MP3Player mp3 = new MP3Player(); // 음악 재생 객체
	ArrayList<Music> musicList = new ArrayList<Music>();
	
	public MusicPlayer() {
		musicList.add(new Music("NO ONE", "이하이", 200, "C://music/이하이 - NO ONE.mp3"));
		musicList.add(new Music("FANCY", "TWICE", 180, "C://music/TWICE - FANCY.mp3"));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));

	}
	
	public void play() {
		if (mp3.isPlaying()) {
			musicList.get(cnt).show();
		} else {
			musicList.get(cnt).show();
			
		}
		mp3.play(musicList.get(cnt).getPath());
		
	}
	
	public void stop() {
		System.out.println("=== 음악 정지 ===");
		mp3.stop();
	}
	
	public void nextPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		cnt++;
		if (cnt >= musicList.size()) {
			cnt = 0;
			System.out.print("===처음 곡으로 돌아갑니다===");
			musicList.get(cnt).show();
		}else {
			musicList.get(cnt).show();
		}
		mp3.play(musicList.get(cnt).getPath());
		
	}
	public void beforePlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		cnt--;
		if (cnt < 0) {
			cnt = musicList.size()-1;
			System.out.print("===마지막 곡으로 돌아갑니다===");
			musicList.get(cnt).show();
		}else {
			musicList.get(cnt).show();
		}
		mp3.play(musicList.get(cnt).getPath());
	}
	

	
	
}
