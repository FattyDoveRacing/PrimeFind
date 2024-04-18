/**
 *
 * @author dove
 */
import java.util.*;

public class Calc {
    private final int ll;
    private final int ul;
    ArrayList<Integer> primes = new ArrayList<>();//arraylist to store prime numbers
    
    public Calc(int ll, int ul){
        this.ll = ll;
        this.ul = ul;
    }
    
    public void calcPrimes(){
        boolean noPrime = false;
        for(int i=ll; i<=ul; i++){//iderate through the range of user specified numbers
            for(int j = 2; j <= i / 2; j++){//find a remainder to check for prime numbers
                if(i % j== 0){
                    noPrime = true;//if no remainder is found flag as not prime
                    break;//and break loop
                }
            }
            if(noPrime == false){
                primes.add(i);//add prime numbers to arraylist
            }
            noPrime = false;//resetting noPrime flag for next iteration
        }
    }
    
    public ArrayList<Integer> getPrimes(){
        return primes;
    }

    public void printPrimes(){
        System.out.println("User Specified Range: " + ll + " to " + ul);
        System.out.println("Number of primes within range: " + primes.size());
        System.out.println("Primes within this range: ");
        for(int i = 0; i < primes.size(); i++){
            System.out.println(primes.get(i));
        }
    }
}
