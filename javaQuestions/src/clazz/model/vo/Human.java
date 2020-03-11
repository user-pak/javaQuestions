package clazz.model.vo;

public class Human {

	private String name;
	private int height;
	private int weight;
	
	public Human() {}
	
	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		System.out.println(this.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return this.name + "'height is " + this.height + "cm and his(her) weight is " + this.weight + "kg";
	}
	
	public void gainWeight(int weight) {
		System.out.println(this.name + " gains " + weight + "kg");
		this.weight += weight;
	}
	
	public void loseWeight(int weight) {
		System.out.println(this.name + " loses " + weight + "kg");
		this.weight -= weight;
	}
}
