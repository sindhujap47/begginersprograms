package basicprograms;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1,num2=20,step=3;
		String result =" ";
		for(int i = num1+1;i<num2;i+=step){
			result+=i+" ";
		}
		System.out.println(result);

	}

}
