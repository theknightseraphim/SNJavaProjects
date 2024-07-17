package Exercise_for;

import java.util.Scanner;

/*Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите "YES", если нет, то "NO".*/

class MyProgram19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean is_kub = false;
        for(String s = sc.nextLine(); true; s = sc.nextLine()){
            if(s.equals("СТОП")) break;
            if(s.equals("Куб")) is_kub = true;
        }
        if(is_kub) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}