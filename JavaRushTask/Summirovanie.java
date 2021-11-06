import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Summirovanie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (; true; )
        {
            int chislo1 = Integer.parseInt(reader.readLine());
            if (chislo1 == -1){
                System.out.println(sum = sum - 1);
                break;
            }
            else {
                sum += chislo1;
            }
        }
    }
}