package basicprograms;

public class DigitOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 355,digit=0,count=0;
while(num>0)
{
	digit = num%10;
	num   = num/10;
	if(digit%2==0)
		count=count+1;
	else
		count = count;
}
	if(count==0)
	System.out.println("All digits are  odd ");
else
	System.out.println("All digits are not odd");
	}
}
