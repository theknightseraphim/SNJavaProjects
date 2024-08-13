package LVL5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class SovershenstvuemF {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());
        int chislo4 = Integer.parseInt(reader.readLine());
        int chislo5 = Integer.parseInt(reader.readLine());

        int minimum = Math.min(chislo5, Math.min(chislo4, Math.min(chislo3, Math.min(chislo2, chislo1))));
        System.out.println("Minimum = " + minimum);
    }


    public static int min(int chislo1, int chislo2, int chislo3, int chislo4, int chislo5) {
        int minimum = Math.min(chislo5, Math.min(chislo4, Math.min(chislo3, Math.min(chislo2, chislo1))));
        return minimum;
    }
}


    /*public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());
        int chislo4 = Integer.parseInt(reader.readLine());
        int chislo5 = Integer.parseInt(reader.readLine());

        int minimum12 = min12(chislo1, chislo2);
        int minimum34 = min34(chislo3, chislo4);
        int minimum1234 = min1234(minimum12, minimum34);
        int minimum12345 = min12345(minimum1234, chislo5);

        System.out.println("Minimum = " + minimum12345);
    }

    public static int min12(int chislo1, int chislo2) {
        return chislo1 < chislo2 ? chislo1 : chislo2;
    }
    public static int min34(int chislo3, int chislo4) {
        return chislo3 < chislo4 ? chislo3 : chislo4;
    }
    public static int min1234(int minimum12, int minimum34) {
        return minimum12 < minimum34 ? minimum12 : minimum34;
    }
    public static int min12345(int minimum1234, int chislo5) {
        return minimum1234 < chislo5 ? minimum1234 : chislo5;
    }
}*/