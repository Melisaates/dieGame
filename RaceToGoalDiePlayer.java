/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
public class RaceToGoalDiePlayer implements DiePlayer {
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        int tsi=myScore;
        int maxTS=maxScore;
        

        if ((tsi >= 71 || maxTS >= 71) && tsi+maxTS<100) {
            return true;

        }
        
        else if(turnTotal<21+Math.round((maxScore-myScore)/8)){
            return true;
        } 
        else if(turnTotal+tsi<=100){
            return true;
        }
        else {
            return false;
        }

    }
}
