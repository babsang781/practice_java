
public class Music {
	
	private String musicName;
	private String singer;
	private int playTime;
	private String path; // �������� ���
	
	public Music(String musicName, String singer, int playTime) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	// ������ �����ε�
	public Music(String musicName, String singer, int playTime, String path) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	
	public String getPath() {
		return path;
	}
	public String getMusicName() {
		return musicName;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlayTime() {
		return playTime;
	}
	
	public void show() {
		System.out.printf("\n[ %3s, %5s, %2d�� %02d�� ]\n\n", getMusicName(),
				getSinger(), getPlayTime()/60,getPlayTime()%60);
	}
	
	
}
