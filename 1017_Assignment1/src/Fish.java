
public class Fish extends Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;


	public Fish (String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		this.age = age;
		this.color = color;
		this.type = "Fish";
		this.weight = weight;
		this.minimumWeight = minimumWeight;

	}

	public void swim() {
		if (weight > minimumWeight) {
			weight--;
		}
		else {System.out.println("Not enough energy!");
		}
		
	}
	

}
