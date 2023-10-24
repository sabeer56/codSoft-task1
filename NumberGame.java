package task1.com;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	static int count=0;
	static int playScore=0;
   static Scanner c=new Scanner(System.in);
	public static void main(String[] args)throws OutOfAttemptException {
		System.out.println("********************************Number Game********************************");
		System.out.println("only five attempts is possible");
		do{
			NumberGame n=new NumberGame();
			if(count<5) {
				 n.genaratedNumber();	
				 count++;
			}
			else {
				System.out.println("Your Score Is  :"+playScore);
				throw new OutOfAttemptException("OutOfAttemptException");
			}
		}while(true);
		
	}
        public void genaratedNumber() {
        	
        	System.out.println("guess the number which will be genarated");
			int user=c.nextInt();
			int lower=1;
			int upper=100;
        	Random random=new Random();
        	int randomNumber=random.nextInt(upper-lower+1);
   	     System.out.println(randomNumber);	
	     int score=20;
	     if(user==randomNumber) {
	    	 playScore=playScore+score;
	     }
	    
        }
}
