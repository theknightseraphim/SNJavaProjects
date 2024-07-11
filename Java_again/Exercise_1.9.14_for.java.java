package Exercise_for;
import java.util.Scanner;

/*В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса.
Напишите программу, которая вычисляет средний возраст учащихся класса.
Вводится натуральное число n - количество человек в классе.
Затем вводится n пар строчек. Каждая пара состоит из имени и возраста ученика.*/

class MyProgram30{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String tempKolPupils = scan.next();
        int kolPupils = Integer.parseInt(tempKolPupils);
        double allAge = 0;
        double allCount = 0;

        for (int i = 1; i <= kolPupils; i++){
            String name = scan.next();
            String tempAge = scan.next();
            int age = Integer.parseInt(tempAge);
            allAge += (double)age;
            allCount++;
        }

        System.out.println(allAge/allCount);
        scan.close();
    }
}