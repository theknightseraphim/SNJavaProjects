import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
Переходим дорогу вслепую
*/

public class Hard_PerehodimDoroguVslepuyu {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());

        if ((time % 5 >= 3) && (time % 5 < 4)){
            System.out.println("жёлтый");
        }
        else if ((time % 5 >= 4) && (time % 5 < 5)){
            System.out.println("красный");
        }
        else System.out.println("зелёный");
    }
}