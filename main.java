/**
 *
 * @author dove
 */
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter lower limit (int):");//collect lower and upper limit data from user
        int ll = in.nextInt();
        System.out.println("Enter upper limit (int):");
        int ul = in.nextInt();
        
        Calc prime = new Calc(ll, ul);//create new calculator class and pass it the users low and upper limits
        
        prime.calcPrimes();//call method in Calc class to calculate primes
        
        prime.printPrimes();//print prime numbers and other realavent data within the prime instance
    }
}
