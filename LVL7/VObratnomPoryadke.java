package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке
*/
public class VObratnomPoryadke {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> strings = new ArrayList<Integer>() ;

        //заполнение списка строками с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(Integer.parseInt(reader.readLine()));
        }
        //удаление 3 элемента списка
        strings.remove(2);

        //вывод на экран
        for (int i = 0; i < strings.size(); i++)
        {
            int j = strings.size() - i - 1;
            System.out.println(strings.get(j) );
        }
    }
}