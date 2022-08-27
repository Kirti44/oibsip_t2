import java.util.Scanner;
import java.util.Random;
public class task1 {
    public static void main(String[] args)
     {
        System.out.println('\n'+"                         -------NUMBER GUESSING GAME-------");
        System.out.println('\n'+"                         --------INSTRUCTIONS-------");
        System.out.println('\n'+"There will be 3 rounds in the game and in each round you will be given 10 attempts to play."
       +" Points will also be given on the basis of in which attempt you give the answer."
       +" If you answers in the first attempt you will be appointed 10 points,if you answer in second attempt you will be awarded with 9 points and so on. ");
         System.out.println('\n'+"------It's time to play----");
        int round=1;
    int attempt;
    int score=0;


        Scanner sc=new Scanner(System.in);
        int num;
       
        int ar[]={10,9,8,7,6,5,4,3,2,1};
        while(round<=3)
        {
            attempt=1;
            Random ra=new Random();
            int gn=ra.nextInt(100)+1;
           
            System.out.println("ROUND "+round+" :");
            while(attempt<=10)
            {
                
                System.out.println("Attempt "+attempt+":");
                System.out.println("Enter the number: ");
                num=sc.nextInt();
                if(num==gn)
                {
                    System.out.println("You have guessed the right number");
                  switch(attempt)
                  {
                      case 1:score=score+ar[0];
                      break;
                      case 2:score=score+ar[1];
                      break;
                      case 3:score=score+ar[2];
                      break;
                      case 4:score=score+ar[3];
                      break;
                      case 5:score=score+ar[4];
                      break;
                      case 6:score=score+ar[5];
                      break;
                      case 7:score=score+ar[6];
                      break;
                      case 8:score=score+ar[7];
                      break;
                      case 9:score=score+ar[8];
                      break;
                      case 10:score=score+ar[9];
                      break;
                      
                  }
                  break;
                }
                else if(num>gn)
                {
                    System.out.println("Number is greater");
                }
                else if(num<gn)
                {
                     System.out.println("Number is smaller");
                }
                 attempt++;
            }
                if(attempt==11){System.out.println("You are not left with more attempts.Please try in next round");}
            
         System.out.println("Your score after round "+round+":"+score);
             round++;
        }
        System.out.println("Succesfuly finished the game.");
        System.out.println("Your final score is:"+score);
       
    }
 
}
