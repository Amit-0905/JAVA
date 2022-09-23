import java.util.*
public class Main
{
	public static void main(String[] args) {
	    int sum=0;
	    for(int i=1;i<=50;i++)
	    sum+=i;
	    
	    int sum1=0;
	    sum1=(50*(50+1))/2;
	    
		System.out.println("Sum of Natural no. from 1 TO 50 using 1st Method= "+sum);
		System.out.println("Sum of Natural no. from 1 TO 50 using 2nd Method= "+sum1);

	}
}
