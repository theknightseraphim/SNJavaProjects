package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/
public class Hard_TheBestsArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //создание списка и ввод 10 строк с клавиатуры
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String aList = reader.readLine();
            list.add(aList);
        }

        //поиск строки максимальной, минимальной длины проверка на то, какая строка раньше в списке
        String longest = list.get(0);
        int index1 = 0;
        String shorts = list.get(0);
        int index2 = 0;
        for (int i = 0; i < list.size(); i++){
            if (longest.length() < list.get(i).length()){
                longest = list.get(i);
                index1 = i;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (shorts.length() > list.get(i).length()){
                shorts = list.get(i);
                index2 = i;
            }
        }

        //вывод на экран самой короткой строки или самой длинной
        if (index2 < index1){
            System.out.println(shorts);
        }
        else {
            System.out.println(longest);
        }
    }
}

        /*//
        String longest = null;
        String shorts = null;
        for (int i = 0; i < list.size(); i++){
            if (longest == list.get(i).length()){
                longest = list.get(i);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (shorts == list.get(i).length()){
                shorts = list.get(i);
                break;
            }
        }*/