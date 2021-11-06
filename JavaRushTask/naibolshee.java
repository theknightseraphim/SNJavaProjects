import java.io.BufferedReader;
import java.io.InputStreamReader;

public class naibolshee {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chis1 = Integer.parseInt(reader.readLine());
        int chis2 = Integer.parseInt(reader.readLine());
        int chis3 = Integer.parseInt(reader.readLine());
        int chis4 = Integer.parseInt(reader.readLine());

        System.out.println(Math.max(Math.max(chis1, chis2), Math.max(chis3, chis4)));
        /*if ((chis1 == chis2) == (chis3 == chis4)){
            System.out.println(chis1);
        }
        else {
            System.out.println(Math.max(Math.max(chis1, chis2), Math.max(chis3, chis4)));
        }*/
    }
}