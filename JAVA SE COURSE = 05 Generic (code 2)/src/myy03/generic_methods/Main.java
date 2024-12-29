package myy03.generic_methods;

class Util{
public static <T> void printAll (T [] array){
	for(T e:array) {
		System.out.println(e);
		}
	
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] numbers = {1,2,3};
		String [] names = {"mgmg","koki","soe"};
		Util.<Integer>printAll(numbers);
		Util.<String>printAll(names);

	}

}
