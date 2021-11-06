import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Три числа
*/

public class TriChisla {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int symbol1 = Integer.parseInt(reader.readLine());
        int symbol2 = Integer.parseInt(reader.readLine());
        int symbol3 = Integer.parseInt(reader.readLine());

        boolean chislo1 = symbol1 == symbol2;
        boolean chislo2 = symbol2 == symbol3;
        boolean chislo3 = symbol3 == symbol1;

        if (chislo1){
            System.out.println(3);
        }
        else if (chislo2){
            System.out.println(1);
        }
        else if (chislo3){
            System.out.println(2);
        }
        else if ((symbol1 != symbol2) && (symbol2 != symbol3)){
            //System.out.println();
        }
        else {

        }
    }
}