public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, -12, 0, -4, 25, 42};

        boolean allPositive = HelpArray.every(numbers, n -> n > 0);
        boolean somePositive = HelpArray.some(numbers, n -> n > 0);
        if(allPositive) System.out.println("Все элементы больше нуля");
        else if(somePositive) System.out.println("Есть элементы больше нуля");
        else System.out.println("Все элементы меньше нуля");
    }
}