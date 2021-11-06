import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
*/

public class Chisla {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(reader.readLine());

        if (chislo == 0){
            System.out.println(0);
        }
        else if (chislo < 0){
            System.out.println(chislo+1);
        }
        else System.out.println(chislo*2);
    }

}