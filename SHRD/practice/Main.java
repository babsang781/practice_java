import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner와 StoreController 객체는 건들지 말 것
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();

		// ------------------------------------------------

		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====음식점보기====");
				for (int i = 0; i < controller.getList().size(); i++) {
					System.out.print(controller.getList().get(i).getName() + "\t");
					System.out.print("평점 : " + controller.getList().get(i).grade() + "\t");
					System.out.println();
				}

			} else if (choice == 2) {
				System.out.println("====미용실보기====");
				for (int i = 0; i < controller.getList2().size(); i++) {
					System.out.print(controller.getList2().get(i).getName() + "\t");
					System.out.print("평점 : " + controller.getList2().get(i).grade() + "\t");
					System.out.println();
				}

			} else if (choice == 3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				String searchStore = sc.next();

				for (int i = 0; i < controller.getList().size(); i++) {
					if (searchStore.equals(controller.getList().get(i).getName())) {
						System.out.println("가게명 : " + searchStore);
						for (int j = 1; j <= 10; j++) {
							System.out.print(j * 10 + "\t");
						}
						System.out.println();
						for (int j = 1; j <= controller.getList().get(i).grade() / 10; j++) {
							System.out.print("*\t");
						}
						System.out.println();
						System.out.println("평점 : " + controller.getList().get(i).grade());
					}
				}

			} else if (choice == 4) {
				System.out.println("====평점보기====");
				String[][] arr = new String[controller.getList().size() + controller.getList2().size() + 1][10];
				int x = 10;

				for (int i = 0; i < controller.getList().size() + controller.getList2().size() + 1; i++) {
					for (int j = 0; j < 10; j++) {
						arr[i][j] = " ";
					}
				}
				// 가로 입력
				for (int i = 0; i < controller.getList().size() + controller.getList2().size() + 1; i++) {
					if (i == 0) {
						for (int j = 0; j < 10; j++) {
							arr[i][j] = Integer.toString(x);
							x += 10;
						}
					} else if (i < controller.getList().size() + 1) {
						for (int j = 0; j < controller.getList().get(i - 1).grade() / 10; j++) {
							arr[i][j] = "*";
						}
					} else if (i >= controller.getList().size() + 1) {
						for (int j = 0; j < controller.getList2().get(i - 1 - controller.getList().size()).grade()
								/ 10; j++) {
							arr[i][j] = "*";
						}
					}
				} // 입력부 완료
				for (int i = 9; i >= 0; i--) {
					for (int j = 0; j < controller.getList().size() + controller.getList2().size() + 1; j++) {
						System.out.print(arr[j][i] + "\t");
					}
					System.out.println();
				}
				for (int i = 0; i < controller.getList().size() + controller.getList2().size(); i++) {
					if (i < controller.getList().size()) {
						System.out.print("\t"+controller.getList().get(i).getName());
					}else {
						System.out.print("\t"+controller.getList2().get(i-controller.getList().size()).getName());
					}
				}
				System.out.println();
				

			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}

}
