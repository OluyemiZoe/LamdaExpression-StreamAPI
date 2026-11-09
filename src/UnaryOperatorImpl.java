import java.util.function.UnaryOperator;

public interface UnaryOperatorImpl {
    static void main() {

        UnaryOperator<Integer> add = (number) -> number + 2;


        IO.println(add.apply(10));
    }
}
