package Exercise_String;
import java.util.Scanner;

/*Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан
с большой буквы, то и замена тоже должна начинаться с большой буквы!*/

public class exsString5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String countOfRecipes = scan.next();    //указываем кол-во рецептов
        scan.nextLine();
        String[] arrayOfLine = new String[Integer.parseInt(countOfRecipes)];    //создаем массив из указанного кол-ва рецептов

        for (int i = 0; i < arrayOfLine.length; i++) {
            String lines = scan.nextLine();
            arrayOfLine[i] = lines;        //записываем рецепты в ячейки массива
        }

        String countOfReplaces = scan.next();                     //указываем кол-во продуктов для замены
        scan.nextLine();
        String[] arrayOfReplace = new String[Integer.parseInt(countOfReplaces)];
        for (int i = 0; i < arrayOfReplace.length; i++) {
            arrayOfReplace[i] = scan.nextLine();
        }
        scan.close();

        for (int i = 0; i < arrayOfLine.length; i++) {
            for (String product : arrayOfReplace) {
                String[] arrayOfWords = product.split(" - ");  //разбиваем рецепт на слова
                arrayOfLine[i] = arrayOfLine[i].replace(arrayOfWords[0], arrayOfWords[1]);
                String allergic = arrayOfWords[0].substring(0, 1).toUpperCase() + arrayOfWords[0].substring(1);
                String prod = arrayOfWords[1].substring(0, 1).toUpperCase() + arrayOfWords[1].substring(1);
                arrayOfLine[i] = arrayOfLine[i].replace(allergic, prod);
            }
        }

        for (int i = 0; i < arrayOfLine.length; i++) {
            System.out.println(arrayOfLine[i]);    //вывод на экран значения ячеек массива рецептов ПОСЛЕ замен
        }
    }
}
