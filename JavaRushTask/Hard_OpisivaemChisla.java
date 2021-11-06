import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Hard_OpisivaemChisla {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(reader.readLine());

        if ((chislo >= 1) && (chislo <= 999)){
            if ((chislo % 2 == 0) && (chislo < 10)){
                System.out.println("четное однозначное число");
            }
            else if ((chislo % 2 == 0) && ((chislo >= 10) && (chislo < 100))){
                System.out.println("четное двузначное число");
            }
            else if ((chislo % 2 == 0) && ((chislo >= 100) && (chislo < 1000))){
                System.out.println("четное трехзначное число");
            }
            else if ((chislo % 2 == 1) && (chislo < 10)){
                System.out.println("нечетное однозначное число");
            }
            else if ((chislo % 2 == 1) && ((chislo >= 10) && (chislo < 100))){
                System.out.println("нечетное двузначное число");
            }
            else if ((chislo % 2 == 1) && ((chislo >= 100) && (chislo < 1000))){
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}