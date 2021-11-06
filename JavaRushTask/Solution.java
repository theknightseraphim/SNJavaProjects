public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int chislo1 = number % 10; //=6
        int chislo2 = ((number % 100) - (number % 10)) / 10; //=4
        int chislo3 = number / 100; //=5
        return chislo1 + chislo2 + chislo3;
    }
}
