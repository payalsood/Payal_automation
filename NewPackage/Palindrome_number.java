package NewPackage;

public class Palindrome_number {

	
	public static void isPalindromeNumber(int num){
		int r = 0;
		int sum = 0;
		int t;
		t=num;
		
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}		
	
		if(t==sum){
			System.out.println("number is a palindrome number");
		}else {
			System.out.println("number is not a palindrome number");
		}
		
	}
	public static void main(String[] args) {
		isPalindromeNumber(151);

	}

}

