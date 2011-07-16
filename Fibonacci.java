
public class Fibonacci {

   public static void main(String[] args){
	   Fibonacci problem = new Fibonacci();
	   long timeStarted = System.currentTimeMillis();
	   System.out.println(problem.fibRecursive(20));
	   System.out.println("Time elapsed for recursive : " + (System.currentTimeMillis() - timeStarted) + " milliseconds");
	   problem.fibIterative(93);  // 93 was the max number before errors occurred due to integer overflow
   }
	   
	public long fibRecursive(int num) {
		if (num <= 1) {
			return num;
		} else {
			return fibRecursive(num - 1) + fibRecursive(num - 2);
		}
	}
	
	public void fibIterative(int num) {
		long firstNum = 0, secondNum = 1, tempNum = 0;  // First 2 numbers in sequence are always 0 and 1
		long timeStarted = System.currentTimeMillis();
		for (int iterations = 0; iterations < num ;iterations ++) {
			System.out.println(firstNum);
			tempNum = secondNum;
			secondNum = firstNum + secondNum;
			firstNum = tempNum;
		}
		System.out.println(secondNum);
		System.out.println("Time elapsed : " + (System.currentTimeMillis() - timeStarted) + " milliseconds");
	}	
}
