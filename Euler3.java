import java.util.ArrayList;


public class Euler3 {

	public static void main(String[] args){
		Euler3 problem = new Euler3();
		problem.euler3Original(600851475143L);
	}
	
	public void euler3Original(long number) {
		long num = number; 
		long i;
		long timeStarted = System.currentTimeMillis(); 
		long totalTime; 	
		ArrayList<Long> factors = new ArrayList<Long>();
		for (i = 2; i <= (num / i); i++) {
			while (num % i == 0) {
				if(!factors.contains(i)){
					factors.add(i);
				}
				num = num / i;
			}
		}
		if (num > 1) {
			factors.add(num);
		}
		totalTime = System.currentTimeMillis() - timeStarted; 
		System.out.println("Time elapsed : " + totalTime + " milliseconds");
		System.out.println(factors.get(factors.size() - 1));
		//And if you want to iterate over the whole arraylist printing all numbers
		//for (Long thisPrime : factors) {
		//	System.out.println(thisPrime);	
		//}
	}
}
