package head_10.example10_1;

/**
 * Created by Pasha on 07.03.2016.
 */
public class Outer {
    private String strOuter;

    public Outer(String strOuter) {
        this.strOuter = strOuter;
    }

    class Inner{
        private String str;
        Inner(String str){
            this.str = str;
        }
        public Outer returnOuter(){
            return Outer.this;
        }
        @Override
        public String toString() {
            return ("Inner{" + "str='" + str + '\'' + '}' + ", strOuter = " + strOuter);
        }
    }

    @Override
    public String toString() {
        return "Outer{" + "strOuter='" + strOuter + '\'' + '}';
    }

    public Inner outInner(String strInit){
        return new Inner(strInit);
    }
}
