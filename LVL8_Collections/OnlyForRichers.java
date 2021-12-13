package SNJavaProjects.LVL8_Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/*
Только для богачей
*/
public class OnlyForRichers {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++){
            map.put("Petrov" + i, i);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : mapCopy.entrySet()){
            if (pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}