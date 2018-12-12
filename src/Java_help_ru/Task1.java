//http://java-help.ru/java-exercises-for-beginners-1/

package Java_help_ru;

import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    InputStreamReader reader;
    StringBuffer buffer;

    Task1(){
     reader = new InputStreamReader(System.in);
     buffer = new StringBuffer();
    }

    public void enterText() throws IOException {
       char t;
       int count = 0;
       do {
           t = (char)reader.read();
           buffer.append(t);
       }while (t != '.');

       for (int i = 0; i < buffer.length(); i++){
           if (buffer.charAt(i) == ' ') count++;
       }
       System.out.println(count);

    }
}
