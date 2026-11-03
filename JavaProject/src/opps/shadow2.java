package opps;

//import com.corejavabasics.encapsulation.Dog;

class cat{
//	ruel-1 to private
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;
//	rule-2a: generic Setter
	void setData(String name,String color,String breed,int cost,int age) {
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost= cost;
		this.age= age;
	}
//	Rule-2b: specific setter
	void setName(String name) {
		this.name = name;
	}
	void setColor(String color) {
		this.color = color ;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	void setCost(int cost) {
		this.cost = cost;
	}
	void setAge(int age) {
		this.age = age;
	}
//	rule-3: generic getter
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
//	rule-3b:spefic getter
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	String getBreed() {
		return breed;
	}
	int getCost() {
		return cost;
	}
	int getAge() {
		return age;
	}
}

public class shadow2 {
	public static void main(String[] args) {
		cat d1=new cat();
		d1.getData();//generic getter cell
		System.out.println("------------");
		d1.setData("Rocy", "Brown", "Pug", 2000, 3);//generic setter cell
		d1.getData();//generic getter cell
		
		System.out.println("-------------");
//		specific setter cell
		d1.setName("Pudina");
		d1.setColor("white");
		d1.setBreed("pug");
		d1.setCost(20000);
		d1.setAge(4);
//		specific getter cell
		System.out.println(d1.getName());
		System.out.println(d1.getBreed());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
	}

}
