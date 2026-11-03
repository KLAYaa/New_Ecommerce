package opps;
class OS{
	String name;
	double version;
	public OS(String name, double version) {
		super();
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public double getVersion() {
		return version;
	}
}
class Mobile{
	OS os=new OS("os-1",3.2);
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVersion());
	}
}
class Charger{
	String Company;
	double Version;
	public Charger(String company, double version) {
		super();
		Company = company;
		Version = version;
	}
	public String getCompany() {
		return Company;
	}
	public double getVersion() {
		return Version;
	}
	
}
public class launch4 {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger("Apple",4.2);
//		getting os details
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("----------");
//		getting charger details
		m.hasCharger(c);
//		killing mobile
		m=null;
		//getting os details
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getVersion());
//		System.out.println("----------");
		System.out.println(c.getCompany());
		System.out.println(c.getVersion());
	}
}
