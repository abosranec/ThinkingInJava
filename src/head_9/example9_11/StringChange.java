package head_9.example9_11;

/**
 * Created by Pasha on 05.03.2016.
 */
public class StringChange {
    public String methodChange(String s){
        int sizeS = s.length();
        for (int i = 0; i < sizeS - 3; i+=4) {
            String sub = s.substring(i, i + 2);
            s = (new StringBuffer(s)).delete(i, i + 2).toString();
            s = ((new StringBuffer(s)).insert(i + 2, sub)).toString();
        }
        return s;
    }

    public String name(){
        return this.getClass().getSimpleName();
    }
}
