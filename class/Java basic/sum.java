public class Sum {
	public static void main(String args[]) {
		int sum = 0;
		
		for(int i = 1; i<=10 ; i++) {
			if(i!=1) System.out.printf("+%d",i);
			else System.out.printf("%d",i);
			sum += i;
		}
		System.out.printf("=%d",sum);
	}
}
