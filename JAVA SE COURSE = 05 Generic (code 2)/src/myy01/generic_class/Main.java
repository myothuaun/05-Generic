package myy01.generic_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = new Box<>();
		box1.set(123);
		System.out.println(box1.get());
		
		Box<String> box2 = new Box<>();
		box2.set("myothuaung");
		System.out.println(box2.get());

	}

}
