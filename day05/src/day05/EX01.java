package day05;

public class EX01 {
	public static void main(String [] args) {
		EX01 obj = new EX01();
		obj.start();
	}
	

	void start() {
	String stra= "do";
	String strb = method(stra);
	System.out.print(":" + stra+strb);
	}
	String method(String stra) {
	stra =stra+ "good";
	System.out.print(stra);
	return "good";
	}
}
