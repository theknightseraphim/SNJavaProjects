package Exercise_other;
import java.util.Random;

/*Ракета бесконечно летает по орбите. Чтобы прервать её полет и вернуть на Землю,
пилоту нужно ввести секретный код — случайное число от 0 до 100.
Напишите программу таким образом, чтобы, когда пилот отгадает код,
полёт ракеты прервался, и он смог полететь домой. */

public class SpacePilot {
    public static void main(String[] args) {
        Random random = new Random(); // Генерирует случайное число
        int secretCode;
        int pilotInput;

        while (true){ // Добавьте цикл - ракета летает бесконечно
            secretCode = random.nextInt(100); // Здесь задаётся код - случайное число от 0 до 100
            System.out.println("Ракета SpaceY на орбите!");
            pilotInput = random.nextInt(100); // Пилот пытается угадать код

            if (secretCode == pilotInput) { // Если пилот угадал код, то цикл должен завершиться
                System.out.println("Пилот угадал число! Летим домой!");
                break;
            }
        }
    }
}
