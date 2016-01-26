package animals;

public class Mammal implements Animal{
	public void eat(){	
		System.out.println("Mammals Eats Meats");
	}
	public void travel(){
		System.out.println("Mammals Travel by Foot");
	}

	public static void main(String args[]){
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	}
}
