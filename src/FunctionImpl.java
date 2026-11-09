import java.util.function.Function;

public interface FunctionImpl {
    static void main(String[] args) {

        Function<Integer, Integer> squareFunction = (number) -> number * number;


        IO.println(squareFunction.apply(5));
    }
}
