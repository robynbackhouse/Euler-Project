
public class Euler6 {

	public static void main(String args[]){
		   euler6(100);
		}

	private static void euler6(int num){
		long timeStarted = System.currentTimeMillis();
		long totalTime;
		long sumSquares = 0;
		long squareSums = 0;
		for(long i = num; i > 0; i--){
			squareSums += i;
			sumSquares += i * i;
		}
		totalTime = System.currentTimeMillis() - timeStarted;
		System.out.println((long)(squareSums*squareSums) - sumSquares );
		System.out.println("Time elapsed: " + totalTime + " msecs");
	}	
}
