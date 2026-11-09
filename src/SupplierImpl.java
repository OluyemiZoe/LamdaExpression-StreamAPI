import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.stream.Stream.generate;

public interface SupplierImpl {
    static void main (){
        Supplier<Integer> integerSupplier = () ->
                new SecureRandom().nextInt(1, 5);

        generate(integerSupplier)
                .forEach((number)->IO.println(number));

    }
}
