
public class Euler5 {

	public static void main(String[] args){
		Euler5 problem = new Euler5();
		problem.euler5Original();
	}
	
	public void euler5Original() {
		boolean hasAnswer = false;
		final int stepValue = 20;
		long testNum = 20;
		long timeStarted = System.currentTimeMillis();
		long totalTime;
		while(!hasAnswer){
			for (int i = stepValue - 1 ; i > (stepValue / 2) ; i--){
				if(testNum % i != 0){
					testNum += stepValue;
					break;
				}
				if(i == ((stepValue / 2) + 1)){
					totalTime = System.currentTimeMillis() - timeStarted;
					System.out.println("Answer : " + testNum);
					System.out.println("Time elapsed : " + totalTime + " milliseconds");
					hasAnswer = true;
				}
			}
		}
	}
}
