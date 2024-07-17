package Exercise_for;
import java.util.Scanner;

/*На вход программе даются строки попарно: пароль, который пришёл Васе и пароль, который он ввёл.
Если Вася вводит неверный пароль, то на экран выводится "INCORRECT n" (где n - номер попытки),
а если правильный, то "CORRECT".
Если Вася исчерпал все попытки, то появляется строка "Error".*/

class MyProgram35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean pin_code_coincided = true;

        while (true){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();

            if(correct.equals(vasya)){
                System.out.println("CORRECT");
                break;
            }
            else if(!correct.equals(vasya)){
                counter++;
                System.out.println("INCORRECT " + counter);
                if(counter == 5){
                    pin_code_coincided = false;
                    break;
                }
            }
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }
    }
}