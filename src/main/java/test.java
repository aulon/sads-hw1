
import java.util.concurrent.ThreadLocalRandom;

public class test {

    public static void main(String args[]) {
	
	    int x = ThreadLocalRandom.current().nextInt(0, 10);
	    int y = ThreadLocalRandom.current().nextInt(0, 10);
	    int z = ThreadLocalRandom.current().nextInt(0, 10);
	    SSL(x, y, z);
    }
			    
	public static void SSL(int x, int y, int z){
		
		int err;
		
        int dummy = 0;

        if (dummy == -1)
	        fail();
		    
        if ((err = serverRandom(x)) != 0 )
            fail();
        if ((err = signedParams(y)) != 0)
            fail();
            //fail();
        if ((err = hashOut(z)) != 0)
            fail();
	    
	    System.out.println("Value of x: " + x);
	    System.out.println("Value of y: " + y);
	    System.out.println("Value of z: " + z);
	
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
