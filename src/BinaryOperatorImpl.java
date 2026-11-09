import java.util.function.BinaryOperator;

public interface BinaryOperatorImpl {
    static void main() {

        BinaryOperator<Integer> max = (number1, number2) -> (number1 > number2) ? number1 : number2;


        System.out.println(max.apply(50, 100));
    }
}
