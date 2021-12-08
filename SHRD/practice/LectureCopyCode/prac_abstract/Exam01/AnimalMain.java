package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		//상위 클래스 선언 및 출력
		Animal animal = new Animal();

		System.out.println("발톱개수: " + animal.claw);
		System.out.println("꼬리길이: " + animal.tailSize);
		System.out.println("무늬: " + animal.pattern);
		System.out.println("이빨: " + animal.teeth);

		// 하위 클래스 선언
		Dog dog = new Dog();
		
		System.out.println(dog.claw);
		System.out.printf("\n\n");
		
		dog.pattern = "stripe";
		Animal animal2 = dog;
		System.out.println(animal.pattern);
		
		System.out.println(dog.pattern);
		System.out.println(animal2.pattern);
		System.out.printf("\n\n");
		
		animal2.pattern = "star pattern";
		System.out.println(animal.pattern);
		
		System.out.println(dog.pattern);
		System.out.println(animal2.pattern);
		
		dog.show();
		animal2.show();
		
	}

}
