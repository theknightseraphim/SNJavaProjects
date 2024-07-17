package Exercise_for;
import java.util.Scanner;

/*У старшего брата маленького Лёши день рождения в тот же день, что и у него.
Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год. Необходимо определить,
в каком году Брат Лёши будет ровно вдвое старше?
Если такое невозможно, то выведите в консоль слово "Никогда".*/

class MyProgram36{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ageAlex = scan.nextInt();
        int ageBrother = scan.nextInt();
        int counter = 2020;

        if (ageBrother - (2*ageAlex) >= 0){
            System.out.println(ageBrother - (2*ageAlex) + counter);
        }
        else System.out.println("Никогда");
        scan.close();
    }
}