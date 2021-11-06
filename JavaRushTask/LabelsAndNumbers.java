import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class LabelsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(reader.readLine());

        if (chislo == 0){
            System.out.println("ноль");
        }
        else if ((chislo < 0) && (chislo % 2 == 0)){
            System.out.println("отрицательное четное число");
        }
        else if ((chislo < 0) && (chislo % 2 != 0)){
            System.out.println("отрицательное нечетное число");
        }
        else if ((chislo > 0) && (chislo % 2 == 0)){
            System.out.println("положительное четное число");
        }
        else if ((chislo > 0) && (chislo % 2 != 0)){
            System.out.println("положительное нечетное число");
        }
        else System.out.println("Это не число.");
    }
}