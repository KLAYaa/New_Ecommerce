package opps;
class Animal{
	void Place() {
		System.out.println("It is present in Forest");
	}
	void eat() {
		System.out.println("This eat only Plants... ");
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("This animal eats aother animals or humans also.");
	}
	void Walk() {
		System.out.println("This Animal run fast ");
	}
}
class Kola extends Animal{
	@Override
	void eat() {
		System.out.println("This animal eats only plants.");
	}
	void Walk() {
		System.out.println("This walk very slow and always sleep");
	}
}
class Zoo{
	void permit(Animal ref) {
		ref.Place();
		ref.eat();
	}
}
public class animalexp {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		Kola k=new Kola();
		Zoo z= new Zoo();
		System.out.println("------Tiger------");
		z.permit(t);
		t.Walk();
		System.out.println("------Kola------");
		z.permit(k);
		k.Walk();
	}
}
