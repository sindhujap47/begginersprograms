

public class SumOfDigits01 {

	public static void main(String[] args) {
		int number =38;
		int sum=getSumOfDigits(number);
		System.out.println("sumof two digited number is:"+sum);
		

	}
public static int getSumOfDigits(int num){
	int d1,d2,sum;
	if((num>=10)&&(num<100)){
		 d1 = num%10;
		d2 = num/10;
		sum = d1+d2;
		return sum;
}
 else
{
	return 0;
}
}
}
