package head_11.example11_1;

import java.util.ArrayList;

/**
 * Created by Pasha on 15.03.2016.
 */
public class WorkClass {
    private int number;

    public WorkClass(int number) {
        this.number = number;
    }

    public void hop(){
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        ArrayList<WorkClass> workClasses = new ArrayList<WorkClass>();
        for (int i = 0; i < 5; i++) {
            workClasses.add(new WorkClass(i));
        }
        for (int i = 0; i < workClasses.size(); i++) {
            (workClasses.get(i)).hop();
        }
        System.out.println();
        for (WorkClass workClass : workClasses) {
            workClass.hop();
        }
    }
}
