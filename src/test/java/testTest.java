import org.junit.Test;

import static org.junit.Assert.*;

public class testTest extends test{
	
	@Test
	public void passServer(){
		int expected = serverRandom(2);
		int real = serverRandom(2);
		assertEquals(expected, real);
	}
	
	@Test
	public void failServer(){
		int expected = serverRandom(2);
		int real = -1;
		assertEquals(expected, real);
	}
	
	@Test
	public void passSigned(){
		int expected = serverRandom(2);
		int real = serverRandom(2);
		assertEquals(expected, real);
	}
	
	@Test
	public void failSigned(){
		int expected = serverRandom(2);
		int real = -1;
		assertEquals(expected, real);
	}
	
	@Test
	public void passHashOut(){
		int expected = serverRandom(2);
		int real = serverRandom(2);
		assertEquals(expected, real);
	}
	
	@Test
	public void failHashOut(){
		int expected = serverRandom(2);
		int real = -1;
		assertEquals(expected, real);
	}

	
}