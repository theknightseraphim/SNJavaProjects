import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Сортировка трех чисел
*/

public class Hard_VivodChisel {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());

        if (((chislo1 < chislo2) && (chislo1 < chislo3)) && ((chislo2 < chislo3) && (chislo2 > chislo1))){
            System.out.println(chislo3 + " " + chislo2 + " " + chislo1);
        }
        else if (((chislo1 < chislo2) && (chislo1 < chislo3)) && ((chislo2 > chislo3) && (chislo2 > chislo1))){
            System.out.println(chislo2 + " " + chislo3 + " " + chislo1);
        }
        else if (((chislo1 > chislo2) && (chislo1 < chislo3)) && ((chislo2 < chislo3) && (chislo2 < chislo1))){
            System.out.println(chislo3 + " " + chislo1 + " " + chislo2);
        }
        else if (((chislo1 > chislo2) && (chislo1 > chislo3)) && ((chislo2 < chislo3) && (chislo2 < chislo1))){
            System.out.println(chislo1 + " " + chislo3 + " " + chislo2);
        }
        else if (((chislo1 > chislo2) && (chislo1 > chislo3)) && ((chislo2 > chislo3) && (chislo2 < chislo1))){
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        }
        else if (((chislo1 < chislo2) && (chislo1 > chislo3)) && ((chislo2 > chislo3) && (chislo2 > chislo1))){
            System.out.println(chislo2 + " " + chislo1 + " " + chislo3);
        }
        else if ((chislo1 == 0) && (chislo2 == 0)){
            System.out.println(chislo3 + " " + chislo1 + " " + chislo2);
        }
        else if ((chislo1 == 0) && (chislo3 == 0)){
            System.out.println(chislo2 + " " + chislo1 + " " + chislo3);
        }
        else if ((chislo1 == 0) && (chislo2 < chislo3)){
            System.out.println(chislo3 + " " + chislo2 + " " + chislo1);
        }
        else if ((chislo1 == 0) && (chislo3 < chislo2)){
            System.out.println(chislo2 + " " + chislo3 + " " + chislo1);
        }
        else if ((chislo2 == 0) && (chislo3 == 0)){
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        }
        else if ((chislo2 == 0) && (chislo1 < chislo3)){
            System.out.println(chislo3 + " " + chislo1 + " " + chislo2);
        }
        else if ((chislo2 == 0) && (chislo3 < chislo3)){
            System.out.println(chislo1 + " " + chislo3 + " " + chislo2);
        }
        else if ((chislo1 == chislo2) && (chislo1 < chislo3)){
            System.out.println(chislo3 + " " + chislo1 + " " + chislo2);
        }
        else if ((chislo1 == chislo3) && (chislo1 < chislo2)){
            System.out.println(chislo2 + " " + chislo1 + " " + chislo3);
        }
        else if ((chislo1 == chislo2) && (chislo1 > chislo3)){
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        }
        else if ((chislo1 == chislo3) && (chislo1 > chislo2)){
            System.out.println(chislo1 + " " + chislo3 + " " + chislo2);
        }
        else if ((chislo2 == chislo3) && (chislo2 < chislo1)){
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        }
        else if ((chislo2 == chislo3) && (chislo2 > chislo1)){
            System.out.println(chislo2 + " " + chislo3 + " " + chislo1);
        }
        else System.out.println("Офигеть можно...");
    }
}