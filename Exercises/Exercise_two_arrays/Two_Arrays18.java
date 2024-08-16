package Exercise_two_arrays;
import java.util.Scanner;

/*В метании молота состязается n спортcменов. Каждый из них сделал m бросков.
Победитель определяется по лучшему результату. Определите количество и самих участников состязаний,
разделивших первое место. Определите количество строк в массиве, которые содержат значение, равное наибольшему.*/

class Two_Arrays18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolAtlets = scan.nextInt();
        int kolTry = scan.nextInt();
        int[][] array = new int[kolAtlets][kolTry]; //создание двумерного массива по кол-ву атлетов и их попыток

        for (int i = 0; i < kolAtlets; i++){
            for (int k = 0; k < kolTry; k++){
                array[i][k] = scan.nextInt();    //заполнение результатами бросков
            }
        }
        scan.close();

        int max = array[0][0];
        String indexMax = "0";
        int count = 1;
        for (int i = 0; i < kolAtlets; i++){
            for (int k = 0; k < kolTry; k++){
                if (max < array[i][k]){
                    max = array[i][k];
                }
            }
        }

        for (int i = 0; i < kolAtlets; i++){
            for (int k = 0; k < kolTry; k++){
                if (max == array[i][k]){
                    indexMax += " " + i;
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(indexMax);
    }
}