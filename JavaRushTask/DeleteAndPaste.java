package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/
public class DeleteAndPaste {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //заполнение списка строками
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String stroka = reader.readLine();
            list.add(stroka);
        }
        //добавление в начало и замена последней строки
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(4));
            list.remove(5);
        }
        //вывод на экран
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}