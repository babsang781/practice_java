package Exam02;

import java.util.Scanner;

public class MyKart implements KartRider{
	
	Scanner sc = new Scanner(System.in);
	int myPosition = start;

	@Override
	public void go(int num) {
		myPosition += num;
		System.out.println(num+"만큼 전진! 부우우웅~");
	}

	@Override
	public void back(int num) {
		myPosition -= num;
		System.out.println(num+"만큼 후진! 부우우웅~");
	}

	@Override
	public void booster(int power) {
		myPosition += power * 2;
		System.out.println(power+"의 두 배 만큼 앞으로 부스터!");
	}
	

}
