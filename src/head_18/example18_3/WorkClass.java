package head_18.example18_3;

import java.io.File;

public class WorkClass {
    public static void main(String[] args) {
        File file = new File("D:\\1.txt");
        file.mkdir();
        file.renameTo(new File("D:\\2.txt"));
    }
}
