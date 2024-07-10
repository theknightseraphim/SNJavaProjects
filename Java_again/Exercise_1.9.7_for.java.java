package Exercise_for;

import java.util.Scanner;

/*Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом".
Слова-паразиты не считаются нормальными словами.

Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите, каким по счёту нормальным словом оно было введено.
В противном случае выведите на экран слово "NO".*/

class MyProgram23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "Куб";
        boolean isStr = false;
        int count = 0;
        int sum = 0;
        for (String i = "СТОП"; !i.equals(str); str = sc.nextLine()) {
            if (str.equals("ээээ") || str.equals("потом")){
                count--;
            }

            count++;
            if (str.equals("Куб")) {
                isStr = true;
                sum += count;
            }
        }
        if (isStr == true) {
            System.out.println(sum);
        } else if (isStr == false) {
            System.out.println("NO");
        }
    }
}