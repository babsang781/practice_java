import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	// �۵��ϴ� ��� MVC �� controller �κ��� �ۼ�
	// ���, ����, ������, ������, ����
	int cnt = 0;
	MP3Player mp3 = new MP3Player(); // ���� ��� ��ü
	ArrayList<Music> musicList = new ArrayList<Music>();
	
	public MusicPlayer() {
		musicList.add(new Music("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3"));
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
		System.out.println("=== ���� ���� ===");
		mp3.stop();
	}
	
	public void nextPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		cnt++;
		if (cnt >= musicList.size()) {
			cnt = 0;
			System.out.print("===ó�� ������ ���ư��ϴ�===");
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
			System.out.print("===������ ������ ���ư��ϴ�===");
			musicList.get(cnt).show();
		}else {
			musicList.get(cnt).show();
		}
		mp3.play(musicList.get(cnt).getPath());
	}
	

	
	
}
