package spiral;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}

	@SuppressWarnings("static-access")
	@Test
	void test() {
		Spiral spiral=new Spiral();
		try {
			spiral.main(new String[] {});
			assertEquals("Please give a valid input", outputStreamCaptor.toString()
				      .trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testInvalidInput() {
		Spiral spiral=new Spiral();
		try {
			spiral.main(new String[] {"Test"});
			assertEquals("Please give a valid input", outputStreamCaptor.toString()
				      .trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testNegativeInput() {
		Spiral spiral=new Spiral();
		try {
			spiral.main(new String[] {"-2"});
			assertEquals("Please give a valid input", outputStreamCaptor.toString()
				      .trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testUpperBound() {
		Spiral spiral=new Spiral();
		try {
			spiral.main(new String[] {"43002"});
			assertEquals("Please enter a smaller value", outputStreamCaptor.toString()
				      .trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	void testSpiral() {
		CreateSpiral s=new CreateSpiral(5);
		char[][] arr= new char[5][5];
		arr[0][0]='*';
		arr[0][1]='*';
		arr[0][2]='*';
		arr[0][3]='*';
		arr[0][4]='*';
		arr[1][4]='*';
		arr[2][4]='*';
		arr[3][4]='*';
		arr[3][3]='*';
		arr[3][2]='*';
		arr[2][2]='*';
		s.createSpiral(5);
		assertArrayEquals(arr,s.getSpiral());
		
	}

}
