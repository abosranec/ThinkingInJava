package head_18.example18_10;

import head_18.example18_8.BufferedInputFile;
import java.io.*;

public class WorkClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            DataInputStream dis = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile.read("src\\head_18\\example18_8\\BufferedInputFile.java", "new").getBytes()));
            int i;
            while ((i = dis.read()) != -1){
                sb.append((char)i);
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder();
        try {
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(new FileInputStream("src\\head_18\\example18_8\\BufferedInputFile.java")));
            System.out.print("Number of symbols before: " + dis.available());
            int i = 0;
            while (dis.available() != 0){
                sb2.append((char)dis.read());
                i++;
            }
            System.out.println(", after: " + dis.available());
            System.out.println("Number of all symbols: " + i + "\n");
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
        System.out.println(sb2);
    }
}
