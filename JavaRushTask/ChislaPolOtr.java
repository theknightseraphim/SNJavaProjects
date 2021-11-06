import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
*/

public class ChislaPolOtr {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());

        int countPol = 0;
        int countOtr = 0;
        if ((chislo1 != 0) && (chislo1 > 0)){
            countPol++;
        }
        if ((chislo2 != 0) && (chislo2 > 0)){
            countPol++;
        }
        if ((chislo3 != 0) && (chislo3 > 0)){
            countPol++;
        }
        if ((chislo1 != 0) && (chislo1 < 0)){
            countOtr++;
        }
        if ((chislo2 != 0) && (chislo2 < 0)){
            countOtr++;
        }
        if ((chislo3 != 0) && (chislo3 < 0)){
            countOtr++;
        }
        System.out.println("количество отрицательных чисел: " + countOtr);
        System.out.println("количество положительных чисел: " + countPol);
    }
}