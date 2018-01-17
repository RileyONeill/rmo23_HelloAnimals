
public class Bird extends Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
	
	public Bird (String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public void fly() {
		if (weight > minimumWeight +1) {
			weight = weight - 2;
		}
		else {System.out.println("Not enough energy!");
		}
	}

}
