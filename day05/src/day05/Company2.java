package day05;

public class Company2 {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c= new Company();
		Company c1= c;
		c1.name="C2TC";
		c.name=null;
		System.out.println(c.name);
	}

}
