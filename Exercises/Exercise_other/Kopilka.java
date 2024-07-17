package Exercise_other;
import java.util.Random;

public class Kopilka {
    public static void main(String[] args) {
        Random random = new Random(); // Генерирует случайное число

        int dayCount = 0; // Для учёта накоплений
        int monthCount = 0; // Для учёта накоплений
        int moneyTotal = 0; // Суммарное количество накоплений
        int moneyToday; // Сколько откладываем сегодня
        int goal = 50000; // Финансовая цель

        while (moneyTotal <= goal) {
            moneyToday = random.nextInt(5000); // Случайная сумма на сегодня
            moneyTotal += moneyToday; // Добавили эти деньги в копилку
            dayCount += 30; // Засчитали день
            monthCount = dayCount/30; //Перевели в месяц
        }

        System.out.println("Ура! Вы смогли накопить " + goal + " за " + monthCount + " месяцев.");
    }
}