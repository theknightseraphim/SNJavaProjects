import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Lvl5DataAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simdate = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simdate.format(date));
    }
}
