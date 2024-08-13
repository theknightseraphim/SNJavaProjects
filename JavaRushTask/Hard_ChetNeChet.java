package LVL5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Hard_ChetNeChet {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();

        for (int i = 0; i < stroka.length(); i++){
            if (stroka.charAt(i) % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: "+ even + " Odd: " + odd);

        /*char chislo1 = stroka.charAt(0);
        char chislo2 = stroka.charAt(1);
        char chislo3 = stroka.charAt(2);
        char chislo4 = stroka.charAt(3);
        char chislo5 = stroka.charAt(4);
        char chislo6 = stroka.charAt(5);
        char chislo7 = stroka.charAt(6);
        char chislo8 = stroka.charAt(7);
        char chislo9 = stroka.charAt(8);
        char chislo10 = stroka.charAt(9);

        if (chislo1 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo2 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo3 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo4 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo5 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo6 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo7 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo8 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo9 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        if (chislo10 % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);*/
    }
}