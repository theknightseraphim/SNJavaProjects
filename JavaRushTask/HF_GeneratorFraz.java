public class HF_GeneratorFraz {
    public static void main (String[] args){
        for (int i = 0; i < 3; i++) {
            String[] wordList1 = {"шикарный", "прекрасный", "великолепный", "гениальный", "восхитительный", "достойный", "бесподобный", "феноменальный", "практичный"};
            String[] wordList2 = {"общепризнанный", "динамичный", "сфокусированный", "нестандартный", "ориентированный", "широко используемый", "сетевой", "электронный"};
            String[] wordList3 = {"подход", "решение", "развитие", "образец", "обзор", "процесс", "тип архитектуры", "уровень"};

            int oneLength = wordList1.length;
            int twoLength = wordList2.length;
            int threeLength = wordList3.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
            System.out.println("Всё, что нам нужно, - это " + phrase);
        }
    }
}
