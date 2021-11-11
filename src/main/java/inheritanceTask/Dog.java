package inheritanceTask;

public class Dog extends Pet {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void makeNoise() {
		System.out.println("I am a dog and am " + age + " years old");
		System.out.println(" ");

	}
}


