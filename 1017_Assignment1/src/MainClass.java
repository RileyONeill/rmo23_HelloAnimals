import java.util.ArrayList;

public class MainClass {
	public static ArrayList<Animal> animals = new ArrayList<Animal>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird Canary = new Bird("1", "Yellow", "Bird", 2, 1);
		animals.add(Canary);
		
		Fish PufferFish = new Fish("2", "Green", "Fish", 2, 1);
		animals.add(PufferFish);
		
		Mammal Elephant = new Mammal("7", "Grey", "Mammal", 700, 600);
		animals.add(Elephant);
		
		Animal.output();
	}

}
