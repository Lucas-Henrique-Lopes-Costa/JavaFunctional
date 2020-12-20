package functionaliinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        // são as mesmas coisas

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    // são as mesmas coisas

    static int incrementByOne(int number) {
        return number + 1;
    }
}
