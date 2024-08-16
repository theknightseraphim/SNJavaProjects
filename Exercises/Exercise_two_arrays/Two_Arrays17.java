package Exercise_two_arrays;
import java.util.Scanner;

/*В метании молота состязается n спортcменов. Каждый из них сделал m бросков.
Победителем соревнований объявляется тот спортсмен, у которого максимален
наилучший результат по всем броскам. Таким образом, программа должна найти значение
максимального элемента в данном массиве, а также его индексы (то есть номер спортсмена и номер попытки).*/

class Two_Arrays17{
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

        int max = array[0][0];  //присвоим мах элементу значение первого элемента массива
        String indexMax = 0 + " " + 0;  //запишем его индекс
        for (int i = 0; i < kolAtlets; i++){
            for (int k = 0; k < kolTry; k++){
                if (max < array[i][k]){         //поиск максимального
                    max = array[i][k];
                    indexMax = i + " " + k;
                }
            }
        }

        System.out.println(max);        //вывод на экран
        System.out.println(indexMax);
    }
}