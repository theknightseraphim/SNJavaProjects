package Exercise_for;

import java.util.Scanner;

/*
Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП"
(гарантируется, что других слов не будет). Найдите произведение ненулевых чисел.
Если же такое произведение найти не удалось, то выведите на экран "Не найдено".

Для того чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45
*/

class MyProgram22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1;
        String stop = "СТОП";
        int sum = 1;
        boolean flag = false;

        for (str1 = scan.next(); !str1.equals(stop); str1 = scan.next()){
            int strToNum1 = Integer.parseInt(str1);
                if (strToNum1 !=0) {
                    sum *= strToNum1;
                    flag = true;
                }
        }
        if (flag == true){
            System.out.println(sum);
        }
        else System.out.println("Не найдено");
        scan.close();
    }
}