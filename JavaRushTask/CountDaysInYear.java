import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
*/

public class CountDaysInYear {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        //при вводе года 2004, выдает
        int vsyear = year % 400; //4
        int usyear = year % 100; //4
        int othervsyear = usyear % 4; //0
        if (((vsyear == 0) || (vsyear == 4)) && ((usyear == 0) || (usyear == 4)) && (othervsyear % 4 == 0)){
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }

        System.out.println(vsyear);
        System.out.println(usyear);
        System.out.println(othervsyear);
    }
}