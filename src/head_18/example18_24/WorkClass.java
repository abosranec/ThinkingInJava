package head_18.example18_24;

import java.io.IOException;

public class WorkClass {
    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("C:\\Program Files (x86)\\Notepad++\\notepad++.exe",
                "D:\\programming\\Java\\project\\ThinkingInJava\\src\\head_18\\example18_24\\WorkClass.java").start();
    }
}
