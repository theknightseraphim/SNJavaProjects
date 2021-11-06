package LVL6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Класс ConsoleReader
*/
public class ConsolReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        return stroka;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(reader.readLine());
        return chislo;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double drobnoe = Double.parseDouble(reader.readLine());
        return drobnoe;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean logical = Boolean.parseBoolean(reader.readLine());
        return logical;
    }

    public static void main(String[] args) throws Exception {

    }
}