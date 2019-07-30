package test;

public class Testing {
	public static void main(String[] args)
	{
		System.out.println("hello");
		System.out.println(bigboy(3));
	}
	
	public static int bigboy(int someNum) {
		for(int i = 0; i < 10; i++) {
			someNum += i;
		}
		return someNum;
	}
}
