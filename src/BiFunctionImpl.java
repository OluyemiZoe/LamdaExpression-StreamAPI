import java.util.function.BiFunction;

public interface BiFunctionImpl {
    static void main() {

        BiFunction<Integer, Integer, Integer> multiplyFunction = (number1, number2) -> number1 * number2;


        System.out.println(multiplyFunction.apply(2, 10));
    }
}
