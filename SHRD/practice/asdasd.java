package test_project;

import java.util.Scanner;
public class asdasd {

	
		public static void main(String[] args) {
			// ���� ���� ����
			Scanner sc = new Scanner(System.in);
			int choice = 9;
			int turn = 0;

			while (choice != 0) {
				System.out.println();
				System.out.println("[�ްԽ�]\n�ްԽǿ��� �л���ǥ �ڻ�� ��(��) �ִ�. \n[������ �ϰڽ��ϱ�?]\n>> [1]����ã�� [2]�߱��ϱ� [0] ������ ���ư���");
				choice = sc.nextInt();

				if (choice == 1) {
					while (choice != 4) {
						System.out.println("\n[���Ÿ� ã�� ��Ҹ� �����ϼ���]\n>> [1]������ ���� [2]�������� [3]�޽Ŀ� ��Ʈ [4] ã�� �ʴ´�.");
						choice = sc.nextInt();
						if (choice == 2) {
							if (quiz()) {
								continue;
							} else {

							}

						} else {
							System.out.println("\n[������ ã������ �ƹ��� ���ŵ� ã�� ���ߴ�. �ٸ� ���� ã�ƺ���.] \n");
						}
					}

				} else if (choice == 2) {
					int usertable����2 = 0;
					int evidence2 = 0;

					if (usertable����2 == 0 && evidence2 == 0) {
						System.out.println("(�÷��̾� �� : '��ξ�, ���� �� 10�� 40�� �濡 ������ �ϰ� �־����ϱ�?'");// get(i).getId()+
						System.out.println("��� : '���� �� �� �ްԽǿ��� ��ũ���� ����� ppt�� ����� �־����ϴ�. "
								+ "�Ͼ�... �����̸� �̷� ����... ���� ppt ������ �ϴµ�...' ");

					} else if (true) { // usertable����2==1 ||evidence2 ==1
						// System.out.println(get(i).getId()+"(): '��ξ�, " + get(i).evidence() + " " +
						// get(i).evidence2()+ " ��(��) �ִµ� �ƹ��� ������ ���ٰ� �Ͻ� �̴ϱ�?!'");

						System.out.println("��� : ��?!... ��.. ���� ����մϴ�! ���� ���� �׷� ���� �ƴմϴ�! "
								+ "\n��... ��!.. �����, �ڳ�2�� ������� �ֱٿ� pbk�� �ο����ϴ�! "
								+ "\n����� �۱��� ���� ������ ���� �� ���Ұ�, pbk�� ȭ�� ���鼭 ���Ծ����! �ڳ��� ������ �׿����� �𸨴ϴ�! ");
					}
				}

				System.out.println();
			}
			sc.close();
		}

		public static boolean quiz() {
			Scanner sc = new Scanner(System.in);
			int answer = 0;
			boolean correct = false;
			int count = 0;
			while (correct == false && count < 6) {
				System.out.print("\n[���ȴ���, �������뿡 ���� ������ �� ����. �׷��� �콼 ��ȣ �ڹ���� ����ְ� ��� �����ִ�.]\n"
						+ "[(�ͼ���) ���� ������ ������ �� ���ڸ� ���߽ÿ�],[0]����\n" + "[ 1 , 11 , 12 , 1121 , 122111 ,   ?   ]\n>> ");
				count++;
				answer = sc.nextInt();

				if (answer == 112213) {
					System.out.println("\n[����, �ڹ��谡 Ǯ�Ƚ��ϴ�]\n['���Ź�: �ұ׽����� �콼 Ŀ��Į' ��(��) �����Ͽ����ϴ�.]");
					correct = true;
				} else if (answer == 0) {
//				turn +=count;
					break;
				} else {
					if(count >5) {
						System.out.println("[����, �ڹ��谡 ������ �� ����.]\n ['���Ź�: �ұ׽����� �콼 Ŀ��Į' ��(��) �����Ͽ����ϴ�.]");
						}else {
							System.out.println("\n[����,����, �ڹ��谡 ������ �ʴ´�. ��ȣ�� Ʋ�� �� ����.]");
						}
				}
//				turn +=count;
				
			}

			return correct;
	}
 }

