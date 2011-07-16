
public class Euler2 {

	public static void main(String[] args){
		Euler2 problem = new Euler2();
		problem.euler2Original();
		problem.euler2Final();
	}
	   
	public void euler2Original() {
		int sumOfEvens = 0, firstNum = 0, secondNum = 1, tempNum = 0;
		long timeStarted = System.currentTimeMillis();
		long totalTime;

		while (secondNum < 4000000){
			tempNum = secondNum;
			secondNum = firstNum + secondNum;
			firstNum = tempNum;

			if (secondNum % 2 == 0){
				sumOfEvens = sumOfEvens + secondNum;
			}
		}
		totalTime = System.currentTimeMillis() - timeStarted;
		System.out.println("Time elapsed : " + totalTime + " milliseconds");
		System.out.println("sum = " + sumOfEvens);
	}
	
	public void euler2Final() {
		int sumOfEvens = 0, firstNum = 0, secondNum = 1, tempNum = 0;
		long timeStarted = System.currentTimeMillis();
		long totalTime;
		int counter = 2; //counter has to start at 2 as this is the third number in fibonacci sequence.

		while (secondNum < 4000000){
			tempNum = secondNum;
			secondNum = firstNum + secondNum;
			firstNum = tempNum;

			//Only want every third number in the sequence
			if (counter == 0){
				sumOfEvens += secondNum;
			}
			counter ++;
			if (counter == 3){
				counter = 0;
			}
		}
		totalTime = System.currentTimeMillis() - timeStarted;
		System.out.println("Time elapsed : " + totalTime + " milliseconds");
		System.out.println("sum = " + sumOfEvens);
	}	
}
