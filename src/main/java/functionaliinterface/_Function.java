package functionaliinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        System.out.println("Função que SOMA 1");
        int increment = incrementByOne(0);
        System.out.println(increment);

        // são as mesmas coisas

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        System.out.println("");
        System.out.println("Função que MULTIPLICA por 10");
        // multiplicando o resultado por 10
        int multiply = multiplyBy10FUnction.apply(increment2);
        System.out.println(multiply);

        // são as mesmas coisas

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10FUnction);
        System.out.println(addBy1AndThenMultiplyBy10.apply(2));
    }

    // função que soma mais 1
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

        // são as mesmas coisas
        static int incrementByOne(int number) {
            return number + 1;
        }

    // função que multiplica por 10
    static Function<Integer, Integer> multiplyBy10FUnction =
        number -> number * 10;


}
