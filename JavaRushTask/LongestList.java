package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самая длинная строка
*/
public class LongestList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > maxStringLength) {
                maxStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == maxStringLength) {
                System.out.println(string);
            }
        }
    }
}


/*//поиск самой длинной строки
        if (strings.get(0).length() < strings.get(1).length()){
            if (strings.get(1).length() < strings.get(2).length()){
                if (strings.get(2).length() < strings.get(3).length()){
                    if (strings.get(3).length() < strings.get(4).length()){
                        longest = strings.get(4);
                    }
                    else longest = strings.get(3);
                }
                else longest = strings.get(2);
            }
            else longest = strings.get(1);
        }
        else longest = strings.get(0);*/