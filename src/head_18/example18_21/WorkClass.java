package head_18.example18_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = "";
        try {
            while ((st = br.readLine()) != null && st.length()!=0) {
                System.out.println(st);
            }
        }catch (IOException io){
            io.getStackTrace();
        }
    }
}
