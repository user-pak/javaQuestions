package clazz.model.vo;

public class Human {

//	private static int counter = 0;
	
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	private int id;
	
	public Human() {
		this.name = "cloned";
	}
	
	public Human(String name) {
		this.name = name;
		this.id = new Id().getId();
	}
	
	public Human(String name, int height, int weight, Day birthday) {
//		super();
		this(name);
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}
	
	public Human(String name, int height, int weight) {
		this(name);
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public int getId() {
		return this.id;
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
		return this.name + "'height is " + this.height + "cm and his(her) weight is " + this.weight + "kg" + " birthday is " + 
				(this.birthday == null? "no info" : this.birthday.toString());
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
