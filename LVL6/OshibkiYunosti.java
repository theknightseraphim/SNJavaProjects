package SNJavaProjects.LVL6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
*/
public class OshibkiYunosti {
    public static int stmax = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int chmax = a > b ? a : b;

        System.out.println("The max is " + stmax + chmax);
    }

}
