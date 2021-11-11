package inheritanceTask;

public class Runner {

	public static void main(String[] args) {
		
		Pet p = new Pet();
		Dog d = new Dog();
		Cat c = new Cat();
		
		
		p.makeNoise();
		p.doThing();
		
		d.setAge(5);
		
		d.makeNoise();
		d.doThing();
		c.makeNoise();
		c.doThing();
	}
}
