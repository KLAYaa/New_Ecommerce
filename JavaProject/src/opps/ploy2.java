package opps;
class Plane1{
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
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low altitude");
	}
	void CarryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at high altitude");
	}
	void CarryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
}
class Airport{
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class ploy2 {
	public static void main(String[] args) {
		CargoPlane1 cp=new CargoPlane1();
		FighterPlane1 fp=new FighterPlane1();
		Airport ap=new Airport();
		System.out.println("------CargoPlane------");
		ap.permit(cp);
		cp.CarryGoods();
		System.out.println("------FighterPlane------");
		ap.permit(fp);
		fp.CarryWeapons();
	}

}

