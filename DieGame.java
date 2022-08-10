public class DieGame {//oyuncu listesinin alıp kazananı belirliyor.
    public static int GOAL_SCORE = 100;
    private int[] scores;
    DiePlayer[] players;
    int myScore;
    int turnTotal;
    int maxScore;
    int rolls;
    
    
/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
    public DieGame(DiePlayer[] players){
        this.players=players;
        scores=new int[players.length];
        for(int i=0;i<players.length ;i++){
            scores[i]=0;
        }
        
    }

    int playTurn(DiePlayer p, int playerNum){
        Die z=new Die();
        boolean k=p.isRolling(myScore,turnTotal,maxScore,rolls);
        int turtoplami=0,m;

        do{
            m=z.nextRoll();
            turtoplami+=m;
        
        }while(k &&  m!=1);
        if(k){
            return turtoplami;
        }
        else if(m==1){
            return 0;
        }
        else{
            return 0;
        }
        

    }
   

    public int play(){
        int kazanan=0;
        while(getMaxScore()!=GOAL_SCORE){
            for(int i=0;i<players.length;i++){
            scores[i]=playTurn(players[i],i);
           }
        }
        
            printScores();
            for(int i=0;i<players.length;i++){
                if(scores[i]==GOAL_SCORE){
                    kazanan=i;
                }
            }
        
        return kazanan;
    
} 
int getMaxScore(){
        int gecicimax=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i]>gecicimax){
                gecicimax =scores[i];
            }
        }
        return gecicimax;

    }
    void printScores(){
        for(int i=0;i<players.length;i++){
            System.out.println(scores[i]);
        }
        
    }
}
