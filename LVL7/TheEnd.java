package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/
public class TheEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //пока не равно "end" вводить новые строки
        ArrayList<String> arrayList = new ArrayList<>();
        while (true){
            String string = reader.readLine();
            if (string.equals("end")){
                break;
            }
            else {
                arrayList.add(string);
            }
        }
        //вывод в консоль
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}