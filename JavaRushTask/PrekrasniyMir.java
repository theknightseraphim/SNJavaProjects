import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Хорошего много не бывает
*/

public class PrekrasniyMir {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        int chislo = Integer.parseInt(reader.readLine());

        int count = 1;
        while (count <= chislo){
            System.out.println(stroka);
            count++;
        }
    }
}