/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
public class HoldAt25DiePlayer implements DiePlayer {
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
     
        if (turnTotal < 25) {
            return true;
        }
        else if((turnTotal + myScore) < 100){
            return true;
        }
        else {
            return false;
        }
    
    }
}