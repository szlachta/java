import java.util.Scanner;

public class Shoes {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with char L and R (the same number of character): ");
        String line = sc.nextLine();
        int count = ShoesPutBasket(line);
        System.out.print("Result:"+count);
	}
	public static int ShoesPutBasket(String A) {
		int countBasker = 0;
        int numberL = 0;
        int numberR = 0;
		for (int i=0; i<A.length(); i++) {
			char c = A.charAt(i);        
	        if (c=='L' && (numberL==0 || numberR==0 || numberL<numberR)) {
	        	numberL++;
	        	if (numberL==numberR) {
		        	numberL=0;
		        	numberR=0;
					countBasker++;
	        	}
	        } else if (c=='R' && (numberR==0 || numberL==0 || numberR<numberL)) {
	        	numberR++;
	        	if (numberL==numberR) {
		        	numberL=0;
		        	numberR=0;
					countBasker++;
	        	}
	        } 
		}
		if (countBasker==0) {
			countBasker = 1;
		}
		return countBasker;
	}
}
