package inheritanceTask;

public class Cat extends Pet {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void doThing() {
		System.out.println("Meow");
		System.out.println(" ");

	}
}
