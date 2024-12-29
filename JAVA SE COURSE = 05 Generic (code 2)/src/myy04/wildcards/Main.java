package myy04.wildcards;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> test1 = new Test<>();
		test1.setV(123);
		
		Test<String> test2 = new Test<>();
		test2.setV("myo");
		
		Test<Person> test3 = new Test<>();
		test3.setV(new Person());
		
		Test<Student> test4 = new Test<>();
		test4.setV(new Student());
		
		
		info(test3);

	}
	public static void info(Test <?> test) {
		System.out.println(test.getV());
	}

}
