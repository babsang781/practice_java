package hw3rdWeek;

public class Ex211201_FindKim {

	public static void main(String[] args) {

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findKim(names));

	}
	
	public static String findKim(String[] names) {
		
		int index = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				index = i;
			}
		}
		return "김서방은 " + (index + 1) + "에 있다.";
	}

}
