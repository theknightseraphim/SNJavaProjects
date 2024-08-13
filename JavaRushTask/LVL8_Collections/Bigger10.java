package SNJavaProjects.LVL8_Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/
public class Bigger10 {
    public static Set<Integer> createSet() {
        Set<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            list.add(i);
        }
        return list;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer chislo = it.next();
            if (chislo > 10){
                it.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}