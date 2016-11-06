package head_18.example18_9;

import head_18.example18_8.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

public class ClassStringReader {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            StringReader sr = new StringReader(BufferedInputFile.read("src\\head_18\\example18_8\\BufferedInputFile.java", "new"));
            int ch;
            while ((ch = sr.read()) != -1) {
                sb.append((char)ch);
                if (ch == 10) i++;
            }
        }catch(IOException io){
            io.getStackTrace();
        }
        System.out.println(sb);
        System.out.println("Number of lines: " + i);
    }
}
