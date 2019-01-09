package Examples.exceptions;

public class Test {
    public void illegalSymbol()throws IllegalInputSymbols{
        throw new IllegalInputSymbols();
    }
    public void invalidType()throws InvalidType{
        throw new InvalidType();
    }
}
