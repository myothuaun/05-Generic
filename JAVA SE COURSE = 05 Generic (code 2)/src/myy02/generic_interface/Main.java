package myy02.generic_interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,String> pair = new CustomPair<>(1,"myo");
		System.out.println(pair.getKey()+":"+pair.getValue());

	}

}
