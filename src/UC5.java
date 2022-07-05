import java.util.Scanner;
public class UC5{
	public static final int Winning_Position=100;
	public static void main(String[] args) {
		int startPosition=0;
		System.out.println("Enter Name--");
		Scanner sc = new Scanner(System.in);
		String Player_Name = sc.next();
		while(Winning_Position>startPosition) {
			int dieRoll = (int)(Math.floor(Math.random()*10)%6 + 1);
			int toWin = Winning_Position - startPosition;
			int checkOption=(int)(Math.floor(Math.random()*10)%3 );
			
		 if(toWin>=dieRoll) {
			 
			 switch (checkOption) {
			 case 0:
				 System.out.println("No Play");
				 startPosition +=0;
				 break;
				 
			 case 1:
				 System.out.println("ladder - " + dieRoll);
				 startPosition +=dieRoll;
				 break;
				 
				 default:
					 System.out.println("Start again");
					 startPosition -= dieRoll;
					 
					
			   }
			 }
		   }
		System.out.println("Player" + Player_Name + "winning position" +startPosition);
		}
	}
}
