import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Рисуем прямоугольник
*/

public class CiclForPryamougolnik {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());

        for (int vertikal = 0; vertikal < chislo1; vertikal++){
            for (int gorizont = 0; gorizont < chislo2; gorizont++) {
                System.out.print("8");
            }
            System.out.println("");
        }

    }
}