package Examples;

public class Outer {
    public Outer(){

    }

    public int val = 5;
    static int age = 20;
    public void show(){
        class Local{
            int val = 10;
            int res = Outer.this.val;
            void show(){
                System.out.println(res);
            }
        }

    }
}
