package SNJavaProjects.TestirovaniePO_Tasks.TestirovaniePO_Tasks;
import java.util.Scanner;

/*
Составить алгоритм: если введенное число больше 7, то вывести "Привет"
*/
public class ASTON_QA_homework_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        } else System.out.println("Need more numbers!");
        scan.close();
    }
}
