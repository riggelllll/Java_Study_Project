package Java_help_ru;

public class Task11 {
    double inputValue;
    Task11(double inputValue){
        this.inputValue = inputValue;
    }

    boolean isInt(){
        return inputValue % 1 == 0;
    }
}
