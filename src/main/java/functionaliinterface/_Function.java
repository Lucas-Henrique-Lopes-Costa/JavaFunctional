package functionaliinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        System.out.println("Função (Pega um Argumentos) que SOMA 1 ");

            int increment = incrementByOne(0);
            System.out.println(increment);

            // são as mesmas coisas

            int increment2 = incrementByOneFunction.apply(0);
            System.out.println(increment2);

        System.out.println("");
        System.out.println("Função (Pega um Argumentos) que MULTIPLICA por 10");

            int multiply = multiplyBy10(2);
            System.out.println(multiply);

            // são as mesmas coisas

            int multiply2 = multiplyBy10Function.apply(2);
            System.out.println(multiply2);

        System.out.println("");
        System.out.println("Função (Pega um Argumentos) que SOMA 1 e MULTIPLICA por 10");

            Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                    incrementByOneFunction.andThen(multiplyBy10Function);
            System.out.println(addBy1AndThenMultiplyBy10.apply(2));

        System.out.println("");
        System.out.println("BiFunction (Pega dois Argumentos) que SOMA 1 e MULTIPLICA por 10");

            System.out.println(
                    incrementByOneAndMultiply(4, 100)
            );

            // são as mesmas coisas

            System.out.println(
                    incrementByOneAndMultiplyBiFunction.apply(4, 100)
            );
    }

    // Função que Soma 1
        static int incrementByOne(int number) {
            return number + 1;
        }
    
        // são as mesmas coisas

        static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;


    // Função que Multiplica por 10
        static int multiplyBy10 (int number) {
            return number * 10;
        }
    
        static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    // Função que Soma e Multiplica por 10 - Pegando 2 Parâmetros
    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

        // são as mesmas coisas
        static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
                (numberToIncrementByOne, numberToMultiplyBy)
                        -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
