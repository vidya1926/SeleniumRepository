package wk1.d1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum = 1;
		int sum =0;
	System.out.println("The first number "+firstNum);
		System.out.println("The second number "+secNum);
	for (int i = 0; i <=11; i++) {
		sum = firstNum +secNum;
		firstNum = secNum;
		secNum = sum;
		System.out.println("The Fibbonoci series " +sum);
	}
	

	}

}
