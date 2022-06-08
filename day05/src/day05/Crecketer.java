package day05;
class Crecketer {
	String mane= "dhoni";
	int age = 39;
	String colour="Brown";
	String role="Batsman";
	String nationality="Indian";
	void Display() {
		System.out.println("I LOVE CRICKET");
		
	}
	public static void main(String args[]) {
	System.out.println("main method started");
	Crecketer c= new Crecketer();
	c.Display();
	System.out.println("main method ended");
	}
}
