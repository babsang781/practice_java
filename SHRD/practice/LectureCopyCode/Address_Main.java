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
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]����");
			switch (n) {

			case 1:
				System.out.print("�̸�: ");
				String a = sc.next();
				System.out.print("����: ");
				int b = sc.nextInt();
				System.out.print("��ȭ��ȣ: ");
				String c = sc.next();

				Address adr = new Address(a, b, c);
				arl.add(adr);
				break;

			case 2: // ��ü ��ȸ ��½� ���� ���, ������ '����ó ����'
				System.out.println(arl.size() + "��");
				if (arl.size() != 0) {
					for (int i = 0; i < arl.size(); i++) {
						System.out.printf("%d. %s(%d��): %s\n", (i + 1), arl.get(i).getName(), arl.get(i).getAge(),
								arl.get(i).getPhoneNumber());
					}
				} else {
					System.out.println("����ó ����");

				}
				break;
			case 3:
				if (arl.size() != 0) {
					for (int i = 0; i < arl.size(); i++) {
						System.out.printf("%d. %s(%d��): %s\n", (i + 1), arl.get(i).getName(), arl.get(i).getAge(),
								arl.get(i).getPhoneNumber());
					}
				} else {
					System.out.println("������ ����ó ����");
				}
				System.out.println();
				System.out.print("������ ����ó ��ȣ �Է�>>");
				int delnum = sc.nextInt();
				arl.remove(delnum - 1);
				break;
			case 4:
				System.out.print("�˻��� �̸� �Է�>>");
				String findName = sc.next();

				if (arl.contains(findName)) {
					System.out.printf("�ش��ϴ� ����ó�� ��ȣ�� %d �Դϴ�.\n", arl.indexOf(findName + 1));
				} else {
					System.out.print("����ó�� �����ϴ�.");

				}

				break;
			case 5:
				System.out.println("���α׷� ����");
				break;

			}
		}

	}

}
