package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Меняем функциональность
*/
public class ChangeFunctional {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).length() % 2) == 0){
                System.out.println(strings.get(i) + " " + strings.get(i));
            }
            else {
                System.out.println(strings.get(i) + " " + strings.get(i) + " " + strings.get(i));
            }
        }
    }
}