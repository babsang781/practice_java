package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_Main {

	public static void main(String[] args) {

		ArrayList<Address> arl = new ArrayList<Address>();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String[] address = new String[3];

		while (n != 5) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료");
			switch (n) {

			case 1:
				System.out.print("이름: ");
				String a = sc.next();
				System.out.print("나이: ");
				int b = sc.nextInt();
				System.out.print("전화번호: ");
				String c = sc.next();

				Address adr = new Address(a, b, c);
				arl.add(adr);
				break;

			case 2: // 전체 조회 출력시 전부 출력, 없으면 '연락처 없음'
				System.out.println(arl.size() + "명");
				if (arl.size() != 0) {
					for (int i = 0; i < arl.size(); i++) {
						System.out.printf("%d. %s(%d세): %s\n", (i + 1), arl.get(i).getName(), arl.get(i).getAge(),
								arl.get(i).getPhoneNumber());
					}
				} else {
					System.out.println("연락처 없음");

				}
				break;
			case 3:
				if (arl.size() != 0) {
					for (int i = 0; i < arl.size(); i++) {
						System.out.printf("%d. %s(%d세): %s\n", (i + 1), arl.get(i).getName(), arl.get(i).getAge(),
								arl.get(i).getPhoneNumber());
					}
				} else {
					System.out.println("삭제할 연락처 없음");
				}
				System.out.println();
				System.out.print("삭제할 연락처 번호 입력>>");
				int delnum = sc.nextInt();
				arl.remove(delnum - 1);
				break;
			case 4:
				System.out.print("검색할 이름 입력>>");
				String findName = sc.next();

				if (arl.contains(findName)) {
					System.out.printf("해당하는 연락처의 번호는 %d 입니다.\n", arl.indexOf(findName + 1));
				} else {
					System.out.print("연락처가 없습니다.");

				}

				break;
			case 5:
				System.out.println("프로그램 종료");
				break;

			}
		}

	}

}
