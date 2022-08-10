/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
public class PlayDie {
    
    public static void main(String[] args) {
        DiePlayer[] g=new DiePlayer[4];
        g[0]=new HoldAt20DiePlayer();
        g[1]=new HoldAt25DiePlayer();
        g[2]=new RaceToGoalDiePlayer();
        g[3]=new MyDiePlayer();

        
        
        int sayac0=0;
        int sayac1=0;
        int sayac2=0;
        int sayac3=0;
        int m=0;
      
        for(int i=0;i<1000;i++){
            DieGame p= new DieGame(g);
            m=p.play();

            if(m==0){
                sayac0++;
            }
            else if(m==1){
                sayac1++;
            }
            else if(m==2){
                sayac2++;
            }
            else if(m==3){
                sayac3++;
            }
            System.out.println("kazanan: "+m);
            System.out.println("---------------------------------------");
    }
  
    System.out.println("1.metod="+sayac0);
    System.out.println("2.metod="+sayac1);
    System.out.println("3.metod="+sayac2);
    System.out.println("4.metod="+sayac3);
    
}
}
