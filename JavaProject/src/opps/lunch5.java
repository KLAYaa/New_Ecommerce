//both is-a and has-a relationship
package opps;
class Heart{
	int valves;
	int beats;
	public Heart(int valves, int beats) {
		super();
		this.valves = valves;
		this.beats = beats;
	}
	public int getValves() {
		return valves;
	}
	public int getBeats() {
		return beats;
	}
}
class Brain{
	int div;
	float iq;
	public Brain(int div, float iq) {
		super();
		this.div = div;
		this.iq = iq;
	}
	public int getDiv() {
		return div;
	}
	public float getIq() {
		return iq;
	}
}
class Human{
	Heart h=new Heart(4,72);
	Brain br=new Brain(3, 4.3f);
}
class Mobile_1{
	String name;
	int cost;
	public Mobile_1(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}
class Book{
	String name;
	String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}
class Student extends Human{
	void hasMobile_1(Mobile_1 m){
		System.out.println(m.getName());
		System.out.println(m.getCost());
	}
	void hasBook(Book br) {
		System.out.println(br.getName());
		System.out.println(br.getAuthor());
	}
}
public class lunch5 {
	public static void main(String[] args) {
		Mobile_1 m= new Mobile_1("OPPO", 200000);
		Book b=new Book("Room_NO:31","Anish");
		Student st= new Student();
		System.out.println(st.h.getBeats());
		System.out.println(st.h.getValves());
		System.out.println(st.br.getDiv());
		System.out.println(st.br.getIq());
		st=null;
		System.out.println("--------------");
		System.out.println(m.getCost());
		System.out.println(m.getName());
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
	}
	
}
