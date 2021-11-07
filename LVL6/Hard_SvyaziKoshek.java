package SNJavaProjects.LVL6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/
public class Hard_SvyaziKoshek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fatherFatherName = reader.readLine();
        Cat catFatherFather = new Cat(fatherFatherName);

        String motherMotherName = reader.readLine();
        Cat catMotherMother = new Cat(motherMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catFatherFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catMotherMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catFatherFather);
        System.out.println(catMotherMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1) {
            this.name = name;
            this.parent1 = parent1;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if ((parent1 == null) && (parent2 == null)){
                return "The cat's name is " + name + ", no mother, no father";
            }
            else if ((parent1 != null) && (parent2 == null)){
                return "The cat's name is " + name + ", no mother, father is " + parent1.name;
            }
            else if ((parent1 == null) && (parent2 != null)){
                return "The cat's name is " + name + ", mother is " + parent2.name + ", no father";
            }
            else return "The cat's name is " + name + ", mother is " + parent2.name + ", father is " + parent1.name;
        }
    }
}