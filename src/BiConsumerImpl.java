import java.util.Map;
import java.util.function.BiConsumer;

public interface BiConsumerImpl {
    static void main(){

        //Instantiating a biconsumer using  lambda exp and pass biconsumer to mapper forEach function

        BiConsumer<String, Integer> customBiConsumer = (name, age) ->
                IO.println("My name is "+name+" and I am "+age+" years old");

        Map<String, Integer> map = Map.of(
                "Adamu", 25,
                "Bola", 900,
                "Dike", 10
        );
        map.forEach(customBiConsumer);
    }
}

 // or pass the lamda expression  directly as an argument


//Map<String, Integer> map = Map.of(
//        "Adamu", 25,
//        "Bola", 900,
//        "Dike", 10
//);
//        map.forEach((name, age) ->
//        IO.println("My name is "+name+" and I am "+age+" years old");
//);
//    }