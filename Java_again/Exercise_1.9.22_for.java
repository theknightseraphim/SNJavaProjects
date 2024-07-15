package Exercise_for;
import java.util.Scanner;

class MyProgram38{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int system = scan.nextInt();
        String nums = "";

        if (number == 0){
            System.out.print(0);
        }
        else if (number !=0 && 2 <= system && system < 10){
            for (; number > 0; number /= system){
                int num = number%system;
                nums += Integer.toString(num);
            }
        }

        StringBuilder builder = new StringBuilder(nums);
        builder.reverse();
        String result = builder.toString();
        System.out.print(result);
    }
}