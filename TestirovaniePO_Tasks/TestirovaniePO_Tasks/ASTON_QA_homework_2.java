package SNJavaProjects.TestirovaniePO_Tasks.TestirovaniePO_Tasks;
import java.util.Scanner;

/*
Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "Привет, Вячеслав", если нет,
то вывести "Нет такого имени"
*/
public class ASTON_QA_homework_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
        scan.close();
    }
}