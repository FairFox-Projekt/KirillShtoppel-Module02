import java.util.*;
//здесь принцип KISS
//Избегание ненужного вложения кода
class NumberProcessor {
    public void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }
}
//Избегание ненужного использования LINQ (с учётом того что это Java тут своя акробатика)
class NumberPrinter {
    public void printPositiveNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }
        int[] bepositive = new int[numbers.length];
        int count = 0;
        for (int n : numbers) {
            if (n > 0) {
                bepositive[count++] = n;
            }
        }
        int[] result = Arrays.copyOf(bepositive, count);
        Arrays.sort(result);
        for (int n : result) {
            System.out.println(n);
        }
    }
}
//Избегание избыточного использования исключений
class DivineDivideMachine {
    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
