import java.util.Scanner;

class ch5{
	public static void main(String[] args) {
		/*
		int[] iArr = {10,20,30,40,50};

		System.out.println(iArr[3]); 
		int[] jArr= new int [3];
		jArr[0]= 0;
		jArr[1]= 1;
		jArr[2]= 3;
		System.out.println(jArr[1]);
		*/
		
		/*
		int[] iArr1 = {1, 2, 3, 4, 5};
		int[] iArr2 = iArr1;
	    
		for (int i = 0; i<iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] = " + iArr1[i]);
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);
		}
		
		iArr2[0] = 10;
		iArr2[1] = 20;
		iArr2[2] = 30;
		
		for (int i = 0; i<iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] = " + iArr1[i]);
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);
		}
		*/
		
		String[] iArrName = {"영희", "철수", "길동", "영수", "말자"};
		int[] iArr3 = new int [5];
		int totalHeight = 0;
		int maxH= 0;
		int maxHindex = 0;
		int minH = 0;
		int minHindex = 0; 
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < iArr3.length; i++) {
			System.out.println(iArrName[i] + "키를 입력하세요.:");
			iArr3[i] =scanner.nextInt();
			totalHeight = totalHeight + iArr3[i];
		}
		System.out.println("학생들의 평균 신장은: " + (totalHeight/iArrName.length) +"입니다.");
		
		for(int i = 0;i<iArr3.length;i++) {
			if (iArr3[i] > maxH) {
				maxH = iArr3[i];
				maxHindex = i;
			}
		}
		System.out.println("가장 큰 학생은 : " + iArrName[maxHindex] +", "+ maxH + "cm 입니다.");

		minH = maxH;
		for(int i = 0;i<iArr3.length;i++) {
			if (iArr3[i] < minH) {
				maxH = iArr3[i];
				maxHindex = i;
			}
		}
		
		System.out.println("가장 작은 학생은 : " + iArrName[minHindex] + "입니다.");
	
	}
}