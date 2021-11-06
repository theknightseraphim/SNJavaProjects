package LVL5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Среднее арифметическое
*/

public class Hard_SredneeArifm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;
        for (; true; )
        {
            int chislo1 = Integer.parseInt(reader.readLine());
            if (chislo1 == -1){
                System.out.println(sum / count);
                break;
            }
            else {
                sum += chislo1;
                count++;
            }
        }
    }
}