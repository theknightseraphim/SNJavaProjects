package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/
public class VNachaloSpiska {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(0, string);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}