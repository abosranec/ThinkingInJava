package head_18.example18_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class BufferedInputFile {
    public static String read(String nameFile, String find){
        BufferedReader bufread;
        StringBuilder strb = new StringBuilder();
        try {
            FileReader fr = new FileReader(nameFile);
            bufread = new BufferedReader(fr);
            String str;
            while ((str = bufread.readLine()) != null){
                if (Pattern.compile(find).matcher(str).find()){
                    strb.append(str + "\n");
                }
            }
            bufread.close();
        }catch(IOException fnf){
            fnf.printStackTrace();
            return "";
        }
        return strb.toString();
    }
    public static void main(String[] args) {
        System.out.println(read("src\\head_18\\example18_8\\BufferedInputFile.java", "new"));
    }
}
