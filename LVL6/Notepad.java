package SNJavaProjects.LVL6;
/*
Блокнот для новых идей
*/
public class Notepad {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription(){
            String write = "You can wrote here.";
            return write;
        }
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
}
