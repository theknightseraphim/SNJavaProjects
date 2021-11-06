import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Настя или Настя?
*/

public class Nastya_Or_Nastya {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if ((!name1.equals(name2)) && (name1.length() != name2.length())){
            System.out.println("чек 1 условия = ОК");
        }
        else if ((!name1.equals(name2)) && (name1.length() == name2.length())){
            System.out.println("Длины имен равны");
        }
        else {
            System.out.println("Имена идентичны");
        }
    }
}