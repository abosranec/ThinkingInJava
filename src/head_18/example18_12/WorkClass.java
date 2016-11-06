package head_18.example18_12;

import java.io.*;

/**
 * Created by Pasha on 06.11.2016.
 */
public class WorkClass {
    static String file = "src\\head_18\\example18_12\\WorkClass.out";
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            dos.writeInt(154);
            dos.writeChar('d');
            dos.writeDouble(1.5);
            dos.writeBoolean(true);
            dos.writeUTF("world");
            dos.close();
        }catch(IOException io){
            System.out.println("File for write didn't found");
        }
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        }catch(IOException io){
            System.out.println("Error reading file!");
        }
    }
}
