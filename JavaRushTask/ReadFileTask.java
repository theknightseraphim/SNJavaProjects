package SNJavaProjects.LVL13_JavaRush;
import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class ReadFileTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
    }
}

/*
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        separator + "C:" + separator + "Users" + separator + "User" + separator + "IdeaProjects" + separator + "JavaTraining" + separator + "src" + separator + "SNJavaProjects" + separator + "LVL13_JavaRush" + separator + "test"
 */