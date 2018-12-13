package Java_help_ru;

class Task15 {
    private int num;
    private StringBuffer buffer;
    Task15(int num){
        this.num = num;
        buffer = new StringBuffer();
    }

    private boolean pali(){
        String input = Integer.toString(num);
        buffer.append(input);
        String reverse = buffer
                .reverse()
                .toString();

        return input.equals(reverse);
    }

    void run(){
     if (pali()) System.out.println("Число палиндром");
     else System.out.println("Число не палиндром");
    }
}
