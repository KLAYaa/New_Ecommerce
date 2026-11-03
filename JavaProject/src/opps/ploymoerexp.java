package opps;
class Plane{
	void takeOff() {
		System.out.println("Plane Took Off..");
	}
	void fly() {
		System.out.println("Plane is flying...");
	}
	void land() {
		System.out.println("Plane has landed...");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low altitude");
	}
	void CarryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at high altitude");
	}
	void CarryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
}
public class ploymoerexp {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		Plane ref;//parent type reference
		System.out.println("------CargoPlane------");
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.CarryGoods();
		System.out.println("------FighterPlane------");
		ref=fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.CarryWeapons();
	}

}

