import java.util.function.Predicate;

public interface PredicateImpl {
    static void main() {

        Predicate<Integer> isEven = (number) -> number % 2 == 0;


        IO.println(isEven.test(8));
        IO.println(isEven.test(5));
    }
}
