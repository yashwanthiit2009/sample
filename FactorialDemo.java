
public class FactorialDemo {

	public static void main(String[] args) {
		
		int n = 5;
		int fact = n;
		
		for (int i=(n-1);i>1;i--){
			fact = fact*i;
		}
		System.out.println("factorial "+fact);
	}

}
