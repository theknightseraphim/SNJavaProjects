package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/
public class Echo {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String aList = reader.readLine();
            list.add(aList);
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s : result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String string : list){
            result.add(string);
            result.add(string);
        }
        return result;
    }
}