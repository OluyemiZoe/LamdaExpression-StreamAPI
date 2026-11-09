import java.util.function.BiPredicate;

public interface BiPredicateImpl {
    static void main() {

        BiPredicate<String, Integer> isLonger = (str, length) -> str.length() > length;


        IO.println(isLonger.test("Oluyemi", 3));
        System.out.println(isLonger.test("Zoe", 5));
    }
}
