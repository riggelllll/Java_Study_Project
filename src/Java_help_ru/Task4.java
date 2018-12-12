package Java_help_ru;

public class Task4 {
    String text;

    Task4(String text){
        this.text = text;
    }

    void censored(){
        System.out.println("AFTER " + text);
        text = text.replaceAll("бяку", "цензура");
        System.out.println("BEFORE " + text);
    }
}
