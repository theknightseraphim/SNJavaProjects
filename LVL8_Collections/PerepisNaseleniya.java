package SNJavaProjects.LVL8_Collections;
import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/
public class PerepisNaseleniya {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
            map.put("Petrov1", "Aleksey");
            map.put("Petrov2", "Andrey");
            map.put("Malishev", "Artem");
            map.put("Bolshev", "Vladimir");
            map.put("Ivanov1", "Vyacheslav");
            map.put("Ivanov2", "Nick");
            map.put("Ivanov3", "Konstantin");
            map.put("Nikitin", "Sergey");
            map.put("Russkikh", "Sergey");
            map.put("Vladimirov", "Sergey");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count1 = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getValue().equals(name)){
                count1++;
            }
        }
        return count1;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count2 = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)){
                count2++;
            }
        }
        return count2;
    }

    public static void main(String[] args) {
        int countName = getCountTheSameFirstName(createMap(), "Sergey");
    }
}