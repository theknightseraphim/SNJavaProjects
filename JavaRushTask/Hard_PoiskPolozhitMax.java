package LVL5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Hard_PoiskPolozhitMax {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        if (N > 0){
            for (int i = 0; i < N; i++){
                int chisla = Integer.parseInt(reader.readLine());
                if (chisla > maximum){
                    maximum = chisla;
                }
            }
        }
        System.out.println("Максимум = " + maximum);
    }
}

    /*public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int chislo1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите ещё 5 чисел:");
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());
        int chislo4 = Integer.parseInt(reader.readLine());
        int chislo5 = Integer.parseInt(reader.readLine());
        int chislo6 = Integer.parseInt(reader.readLine());

        int maximum = Math.max(chislo6, Math.max(chislo5, Math.max(chislo4, Math.max(chislo3, Math.max(chislo2, chislo1)))));
        System.out.println("Максимум = " + maximum);
    }*/