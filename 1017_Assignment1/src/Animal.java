import java.util.ArrayList;

public class Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;


	
	public Animal (String age, String color, String type, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
		
	public void eat() {
		weight ++;
	}
	
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return (type+ ", "+ age +" years old,  " + color+ ", weight is " + weight + " lbs.");
	}

	
	public static void output() {
		for ( int i = 0; i < MainClass.animals.size(); i++) {
			System.out.println(MainClass.animals.get(i) );
		}
	}

}
