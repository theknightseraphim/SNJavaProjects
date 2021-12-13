package SNJavaProjects.LVL8_Collections;
import java.util.HashSet;
import java.util.Set;

/*
Set из растений
*/
public class LearnSet1 {
    public static void main(String[] args) {
        Set<String> listSet = new HashSet<String>();
        listSet.add("арбуз");
        listSet.add("банан");
        listSet.add("вишня");
        listSet.add("груша");
        listSet.add("дыня");
        listSet.add("ежевика");
        listSet.add("женьшень");
        listSet.add("земляника");
        listSet.add("ирис");
        listSet.add("картофель");

        for (String print : listSet){
            System.out.println(print);
        }
    }
}