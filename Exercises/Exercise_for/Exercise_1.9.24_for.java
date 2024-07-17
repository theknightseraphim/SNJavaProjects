package Exercise_for;
import java.util.Scanner;

/*Для постановки Сказки красная шапочка в детском саду "Солнышко"
было решено выбрать самого маленького по росту ребёнка на роль
красной шапочки и самого большого на роль волка.

На вход программе даётся число n, затем 2*n строк.
Каждая пара строк - Имя ребёнка и его рост. Выведите на разных строках два имени:
ребёнка, который будет играть красную шапочку и ребёнка, который будет играть волка.
Если детей одного наименьшего или наибольшего роста несколько, то
выберите первого из встретившихся.
Гарантируется, что все имена различны и есть минимум 1 ребёнок.*/

class MyProgram40{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kids = scan.nextInt();
        String name = scan.next();
        int height = scan.nextInt();
        String name1 = name;
        int height1 = height; //max
        String name2 = name;
        int height2 = height; //min

        for (int i = 0; i < kids-1; i++){
            name = scan.next();
            height = scan.nextInt();
            if (height > height1){
                name1 = name;
                height1 = height;
            }
            else if (height < height2){
                name2 = name;
                height2 = height;
            }
        }
        if (height1 != height2 && kids > 1){
            System.out.println(name2);
            System.out.println(name1);
        }
        else if (kids == 1){
            System.out.println(name1);
            System.out.println(name1);
        }
        else if (kids <= 0){
            System.out.println("Where are the children?");
        }
    }
}