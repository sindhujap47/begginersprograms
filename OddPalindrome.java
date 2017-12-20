package basicprograms;

public class OddPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1551;
		int reverse;
		if(checkAllDigitsOdd(number)){
			reverse = reverse(number);
			
			if(checkPalindrome(number,reverse))
				
				System.out.println("number is a palindrome");
			else
				
				System.out.println("Number is not a palindrome");
		}
		else{
			 
			System.out.println("Number is not odd palindrome");
		    }
	}
public static	boolean checkAllDigitsOdd(int number){
	int digit,count=0;
	while(number>0){
		digit=number%10;
		number=number/10;
		if(digit%2==0)
			count++;
}
if(count==0)
	return true;
else 
	return false;

}

public static int reverse(int number){
	int digit;
	int reverse=0;
	
	while(number>0){
		digit = number%10;
		reverse= reverse*10+digit;
				number=number/10;
	}
	return reverse;
		
}

public static boolean checkPalindrome(int number,int reverse){
	if(number==reverse)
		return true;
	else
		return false;
}
}