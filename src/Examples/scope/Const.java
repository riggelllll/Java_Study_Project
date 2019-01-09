package Examples.scope;

interface Const{
    int YES = 2;
    int NO = 0;
    String[] vals = {"A", "B", "C", "D"};
    static int res(){
        return YES * YES;
    }
}
