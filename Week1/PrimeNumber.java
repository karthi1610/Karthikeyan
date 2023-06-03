package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;
		boolean flag=false;
		int i;

		for(i=2;i<=input-1; i++) {
			if(input % i ==0) {
				flag = true;
				break;
			}
		}
		if (flag != true)
			System.out.println(input + " Is Prime ");
		else
			System.out.println(input + " Is Not prime ");
	}

}
