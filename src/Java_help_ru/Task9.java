package Java_help_ru;

public class Task9 {
    String text;

    Task9(String text){
        this.text = text;
    }

    void reverseStr(int pos, int length){
        if (pos == length) return;
        else reverseStr(pos +1, length);
        System.out.print(text.charAt(pos));
    }
}
