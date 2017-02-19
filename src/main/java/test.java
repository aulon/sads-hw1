
import java.util.concurrent.ThreadLocalRandom;

public class test {

    public static void main(String args[]) {
    	
    	int err;
	
	    int n = ThreadLocalRandom.current().nextInt(0, 10);
	    
	    System.out.println("Value of n: " + n);
    	
        int dummy = 0;

        if (dummy == -1)
        	fail();
        
        if ((err = serverRandom(n)) != 0 )
            fail();
        if ((err = signedParams(n)) != 0)
            fail();
            fail();
        if ((err = hashOut(n)) != 0)
            fail();
        

        System.out.println("Testing line #1");
        System.out.println("Testing line #2");
    }
    
    public static int serverRandom(int n){
    	return (n % 2);
    }
	
	public static int signedParams(int n){
		return (n % 2);
	}
	
	public static int hashOut(int n){
		return (n % 2);
	}

    private static void fail() throws IllegalArgumentException {
        throw new IllegalArgumentException("Invalid");
    }
}
