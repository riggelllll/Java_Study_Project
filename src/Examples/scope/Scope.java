package Examples.scope;

import Examples.Outer;
interface My{
    void my();
}

public class Scope extends Outer{
    public Scope(){
      Alphabet.test();
    }
    int val = 1;
    public void show(){
        System.out.println(super.val);
    }



}
