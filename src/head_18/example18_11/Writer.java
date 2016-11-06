package head_18.example18_11;

import head_18.example18_8.BufferedInputFile;

import java.io.*;

public class Writer {
    public static String fileread = "src\\head_18\\example18_11\\Writer.java";
    public static String filewrite = "src\\head_18\\example18_11\\Writer.out";

    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileread));
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(filewrite)));
            // or PrintWriter printWriter = new PrintWriter(filewrite);
            String st = "";
            while((st = bf.readLine()) != null){
                printWriter.println(st);
            }
            printWriter.close();
        }catch (IOException io){
            System.out.println("File didn't found!");
        }
        System.out.println(BufferedInputFile.read(filewrite, ""));
    }
}
