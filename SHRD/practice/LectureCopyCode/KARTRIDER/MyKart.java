package Exam02;

import java.util.Scanner;

public class MyKart implements KartRider{
	
	Scanner sc = new Scanner(System.in);
	int myPosition = start;

	@Override
	public void go(int num) {
		myPosition += num;
		System.out.println(num+"��ŭ ����! �ο���~");
	}

	@Override
	public void back(int num) {
		myPosition -= num;
		System.out.println(num+"��ŭ ����! �ο���~");
	}

	@Override
	public void booster(int power) {
		myPosition += power * 2;
		System.out.println(power+"�� �� �� ��ŭ ������ �ν���!");
	}
	

}
