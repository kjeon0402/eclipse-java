package dataType;

public class Quiz2 {
	public static void main(String[] args) {
		String name = "강지언";
		Integer age = 27;
		Double db = 0.0;
		db = 3.14;
		Float fl = (float)(double)db;
		
		Float fl2 = db.floatValue();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(db);
		System.out.println(fl);
		System.out.println(fl2);
	}
}
