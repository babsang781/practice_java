package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		//���� Ŭ���� ���� �� ���
		Animal animal = new Animal();

		System.out.println("���鰳��: " + animal.claw);
		System.out.println("��������: " + animal.tailSize);
		System.out.println("����: " + animal.pattern);
		System.out.println("�̻�: " + animal.teeth);

		// ���� Ŭ���� ����
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
