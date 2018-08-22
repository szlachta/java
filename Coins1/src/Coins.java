import java.util.Scanner;

/*Get the number of the pairs in Coin Toss */

public class Coins {

	public Coins() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in format: 1,0,0,1 where 0=rewers,1=awers: ");
        String line = sc.nextLine();
        int[] value = new int[line.split(",").length];
        for (int i=0; i<line.split(",").length;i++) {   	
        	value[i] =Integer.parseInt(line.split(",")[i]);    	
        }
        int count = getNumberOfPairsInCoinToss(value);
        System.out.print("Result:"+count);

	}
	
	public static int getNumberOfPairsInCoinToss(int[] A) 
	{
		int pairs = 0;
		int count0 = 0;
		int count1 = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i]==0) {
				count1 = 0;
				count0 ++;
				if (count0 == 2) {
			        pairs ++;
					count0 = 0;
				}
			}
			if (A[i]==1) {
				count0 = 0;
				count1 ++;
				if (count1 == 2) {
			        pairs ++;
					count1 = 0;
				}
			}
		}
		return pairs;
	}

}
