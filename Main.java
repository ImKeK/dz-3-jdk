public class Main {
    public static void main(String[] args) {
        // Пример использования Calculator
        System.out.println("Sum: " + Calculator.sum(5, 10.5)); // 15.5
        System.out.println("Multiply: " + Calculator.multiply(5, 10.5)); // 52.5
        System.out.println("Divide: " + Calculator.divide(10.0, 2)); // 5.0
        System.out.println("Subtract: " + Calculator.subtract(10, 2.5)); // 7.5

        // Пример использования compareArrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array1, array2)); // true

        // Пример использования Pair
        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println("Pair: " + pair); // Pair: (Hello, 123)
    }
}