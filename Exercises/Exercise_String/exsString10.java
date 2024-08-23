package Exercise_String;
import java.util.Scanner;

class exsString10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayLine = scan.nextLine().replaceAll(" ", "").split("");
        scan.close();
        String usuaLine = "";
        String reverseLine = "";
        for (int i = 0; i < arrayLine.length; i++){
            usuaLine += arrayLine[i];
        }
        for (int i = arrayLine.length-1; i > -1; i--){
            reverseLine += arrayLine[i];
        }

        if (usuaLine.equalsIgnoreCase(reverseLine)) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}