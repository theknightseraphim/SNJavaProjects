package LVL5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hard_Kopilka {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String exit = reader.readLine();
            if (exit.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            int chislo1 = Integer.parseInt(exit);
            sum += chislo1;
        }
    }
}