package homework1;

import java.util.Random;

public class code {
	public static void main(String[] args) {
		final int LENGTH =20;
		int i;
		boolean check = false;
		int[] numbers=new int[LENGTH + 1];
		Random rand = new Random();
		for( i=0;i<LENGTH;i++) {
			numbers[i]=rand.nextInt(7);
		}
		for(i=0;i<LENGTH;i++) {
			if(numbers[i]==numbers[i+1]) {
				if(check==false)
				System.out.print("(");
				check =true ;
			}
			System.out.print(numbers[i]+" ");
			if(check==true) {
				if(numbers[i]!=numbers[i+1]) {
					System.out.print(") ");
					check = false;
				}
			}
	
			
		}
		System.out.println();
		//for(i=0;i<20;i++)
			//System.out.println(numbers[i]);
		
	}
	
}
