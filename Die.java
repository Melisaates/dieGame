/**Melisa Ateş
 * atesmel12@gmail.com
 * 05.05.2021
 */
import java.util.Random;
public class Die {
    Random r = new Random();
    public int nextRoll(){
        
        int m=r.nextInt(6)+1;
        return m;
    }
}






