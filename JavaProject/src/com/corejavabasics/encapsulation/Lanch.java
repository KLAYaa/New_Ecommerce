package com.corejavabasics.encapsulation;
class Dog{
//	ruel-1 to private
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;
//	rule-2a: generic Setter
	void setData() {
		name="Ramu";
		color="Brown";
		breed="GR";
		cost= 7000;
		age= 8;
	}
//	Rule-2b: specific setter
	void setName(String a) {
		name=a;
	}
	void setColor(String a) {
		color=a;
	}
	void setBreed(String a) {
		breed=a;
	}
	void setCost(int a) {
		cost=a;
	}
	void setAge(int a) {
		age=a;
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

public class Lanch {
	public static void main(String[] args) {
		Dog d1=new Dog();
//		d1.name="Rocy";//it is not accessible as it is private
//		d1.color="browm";//it is not accessible as it is private
//		d1.breed="pug";//it is not accessible as it is private
//		d1.cost="2000";//it is not accessible as it is private
//		d1.age=3;//it is not accessible as it is private
//		System.out.println(d1.name);
		
		d1.getData();//genric getter cell
		System.out.println("------------");
		d1.setData();//generic setter cell
		d1.getData();//gneric getter cell
		
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

