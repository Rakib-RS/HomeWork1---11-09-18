package homework1;

import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		final int LENGTH =20;
		int i,count=0,position=0,max=0;
		int[] numbers=new int[LENGTH +1];
		Random rand = new Random();
		for( i=0;i<LENGTH;i++) {
			numbers[i]=rand.nextInt(7);
		}
		for(i=0;i<LENGTH;i++) {
			if(numbers[i]==numbers[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					position=i-count;
				}
				count =0;
			}
			
		}
		for(i=0;i<LENGTH;i++) {
			if(i==position)
				System.out.print("(");
			System.out.print(numbers[i]+" ");
			if(i==position+max)
				System.out.print(")");
		}
		System.out.println();
		//for(i=0;i<20;i++)
			//System.out.println(numbers[i]);
		
	}
	
}
