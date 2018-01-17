
public class Mammal extends Animal {
	
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	public Mammal (String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
		
	}
	
	public void run() {
		if (weight > minimumWeight) {
			weight--;
		}
		else {System.out.println("Not enough energy!");
		}
	}
	
}

