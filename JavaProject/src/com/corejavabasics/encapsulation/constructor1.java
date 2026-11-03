package com.corejavabasics.encapsulation;
class Cricketer{
	private String name;
	private String country;
	private int runs;
	private int wickets;
	private int catches;
//	zero parameterized 
	Cricketer(){
		this.name="Virat";
		this.country="Ind";
		this.runs=7000;
		this.wickets=7;
		this.catches=80;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
//	one parameterized
	Cricketer(String name){
		this();
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
//	two parameterize
	Cricketer(String name,String country){
		this("Smith");
		this.name=name;
		this.country=country;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
//	three parameterized
	Cricketer(String name,String country,int runs){
		this("ABD","SA");
		this.name=name;
		this.country=country;
		this.runs=runs;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
//	four parameterized
	Cricketer(String name,String country,int runs,int wickets){
		this("Gayle","WI",9000);
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
//	five parameterized 
	Cricketer(String name,String country,int runs,int wickets,int catches){
		this("Rohith","Ind",6000,35);
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.catches=catches;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
}

public class constructor1 {
	public static void main(String[] args) {
		Cricketer c=new Cricketer("Sachin","IND",23000,300,400);
	}

}
