import java.util.Scanner;

/* Minimal rotate X die to get the same value */

public class Dice {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter die number in format: 1,3,4,2: ");
        String line = sc.nextLine();
        int[] value = new int[line.split(",").length];
        for (int i=0; i<line.split(",").length;i++) {   	
        	value[i] =Integer.parseInt(line.split(",")[i]);    	
        }
        int count = DiceMinMovementToTheSameValue(value);
        System.out.print("Result:"+count);
	}
	
	public static int DiceMinMovementToTheSameValue(int[] A) 
	{
		int countMin = -1;
		int [][] pair = {{1,6},
						 {2,5},
						 {3,4}};
		/*	all die sides */
		for (int i = 1; i <=6; i++) {
			int count = 0;
			/* all input elements */
			for (int j=0; j<A.length; j++) {
				if (i!=A[j]) {
					for (int k=0; k<=2; k++) {
						if (pair[k][0]==A[j] || pair[k][1]==A[j]) {
							if (pair[k][0]==i || pair[k][1]==i) {
								count=count+2;
							} else {
								count++;
							}
						}
					}
				}
			}
			if (countMin==-1 || countMin>count) {
				countMin=count;
			}
		}
		return countMin;
	}

}
