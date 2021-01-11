package spiral;

import java.io.*;
public class Spiral {
	
	// main class
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please give a valid input");
			return;
		}
		
		int n=0;
		//Integer validation
		
		try {
		 n = Integer.parseInt(args[0]);
		}catch(Exception e) {
			System.out.println("Please give a valid input");
			return;
		}
		
		//check for negative values
		if(n<0) {
			System.out.println("Please give a valid input");
			return;
		}
		
		//check for <43000 for memory restrictions
		if(n>43000) {
			System.out.println("Please enter a smaller value");
			return;
		}

		CreateSpiral spiral = new CreateSpiral(n);
		spiral.createSpiral(n);

	}
}
