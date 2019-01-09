package Examples.scope;

public interface Alphabet extends Const{
    String[] vals = {"E", "F", "G", "H"};
    default void run(){
       for (String str : Const.vals){
           System.out.print(str);
       }
    }
    static void test(){
        System.out.println(Const.res());
    }
}
