/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {
    
    
    
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
       
        System.out.println("Roll or Hold?");
        System.out.println("Press Enter meaining roll");
        
        Scanner s=new Scanner(System.in);
        String deger=s.nextLine();
        if(deger==null){
            return true;
        }
        else{
            return false;
        }

    }
}
