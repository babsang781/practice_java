import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cnt = 0;
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

		// 수정 후
		musicList.add(new Music("깡", "Rain", 100));
		musicList.add(new Music("NO ONE", "이하이", 120));
		musicList.add(new Music("FANCY", "TWICE", 110));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 120));

		while (n != 5) {

			System.out.print("1.재생, 2.정지, 3.다음곡, 4.이전곡, 5 종료 >> ");
			n = sc.nextInt();
			switch (n) {

			case 2:// 정지
				break;
			case 3:// 다음곡
			case 4:// 이전곡
				if (n == 3) {
					cnt++;
				} else if (n == 4) {
					cnt--;
				}
				if (cnt < 0) {
					cnt = musicList.size() - 1;
					System.out.print("===마지막 곡으로 돌아갑니다===");
				}else if(cnt>=musicList.size()) {
					cnt=0;
					System.out.print("===처음 곡으로 돌아갑니다===");
				}
			case 1: // 재생>> 깡, Rain, 1분 40초
				musicList.get(cnt).show();
				break;
			case 5:// 종료
				System.out.println("프로그램 종료");
			}

		}

		sc.close();
	}

}
