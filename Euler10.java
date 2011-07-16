public class Euler10{

	   public static void main(String[] args){
		   Euler10 problem = new Euler10();
		   System.out.println(problem.PrimeFinder(2000));
	   }
		
	   public long PrimeFinder(int num){
		long timeStarted = System.currentTimeMillis();
		long totalTime;
		long answer = 0L;
		for(long i = 2L; i < num; i++){
		     if(isPrime(i)){
			answer += i;
		     }
		}
		totalTime = System.currentTimeMillis() - timeStarted;
		System.out.println("Time elapsed: " + totalTime + " msecs");
		return answer;
	   }
		
	   private boolean isPrime(long num){
		for (long i = 2L; i <= (num/2); i++){
		     if(num > 2 && (num % i == 0)){
			return false;
		     }
		}
		return true;
	   }
	}