//abstraction one1-
package abstraction1;
abstract class Plane{
	abstract void tookoff();// since it is unimplemented it is abstract method
	abstract void fly();// since it is unimplemented it is abstract method
	void land() {
		System.out.println("Plane Landed");
	}
}
class CargoPlane extends Plane{

	@Override
	void tookoff() {
		System.out.println("Cargo Plane tookoff");
	}

	@Override
	void fly() {
		System.out.println("Cargo Plane is fly at low altitude");
		
	}
	
}
class PassengerPlane extends Plane{
	@Override
	void tookoff() {
		System.out.println("Passenger Plane tookoff");
	}

	@Override
	void fly() {
		System.out.println("Passenger Plane is fly at low altitude");
		
	}
}
class FighterPlane extends Plane{
	@Override
	void tookoff() {
		System.out.println("Fighter Plane tookoff");
	}

	@Override
	void fly() {
		System.out.println("Fighter Plane is fly at high altitude");
		
	}
}
public class Launch {
	public static void main(String[] args) {
		PassengerPlane p=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		CargoPlane cp=new CargoPlane();
		int count=1;
		System.out.println("Plane = "+count);
		p.tookoff();
		p.fly();
		p.land();
		count++;
		System.out.println("----------------");
		System.out.println("Plane = "+count);
		cp.tookoff();
		cp.fly();
		cp.land();
		count++;
		System.out.println("----------------");
		System.out.println("Plane = "+count);
		fp.tookoff();
		fp.fly();
		fp.land();
		count++;
		System.out.println("----------------");		
	}
}
