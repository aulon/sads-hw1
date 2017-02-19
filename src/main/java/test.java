
import java.util.concurrent.ThreadLocalRandom;

public class test {

    public static void main(String args[]) {

        int x = ThreadLocalRandom.current().nextInt(1, 50);

        int y = ThreadLocalRandom.current().nextInt(1, 50);

        int z = ThreadLocalRandom.current().nextInt(1, 50);

        int w = 0;

        if (w < 0);
            fail();
        if (x < 0)
            fail();
        if (y < 0)
            fail();
            fail();
        if (z < 0)
            fail();

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }

    private static void fail() throws IllegalArgumentException {
        throw new IllegalArgumentException("Invalid");
    }
}
