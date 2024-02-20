package uvg.edu.gt;

public class MyPfCalc {
    private UvgStack<Integer> numeros;

    /**
     * Constructor que recibe una pila de enteros.
     * @param pila Pila de enteros para realizar cálculos.
     */
    public MyPfCalc(UvgStack<Integer> pila) {
        this.numeros = pila;
    }

    public Integer calc(String problem) {
        // Verifiquemos que la pila de números esté vacía
        while (!numeros.isEmpty()) {
            numeros.pop();
        }

        int respuesta = 0;

        for (int i = 0; i < problem.length(); i++) {
            char v = problem.charAt(i);

            if (Character.isDigit(v)) {
                numeros.push(Character.getNumericValue(v));
            } else {
                switch (v) {
                    case '+':
                        respuesta = numeros.pop() + numeros.pop();
                        numeros.push(respuesta);
                        break;
                    case '-':
                        int subtrahend = numeros.pop();
                        respuesta = numeros.pop() - subtrahend;
                        numeros.push(respuesta);
                        break;
                    case '*':
                        respuesta = numeros.pop() * numeros.pop();
                        numeros.push(respuesta);
                        break;
                    case '/':
                        int divisor = numeros.pop();
                        respuesta = numeros.pop() / divisor;
                        numeros.push(respuesta);
                        break;
                    default:
                        // Caracter no reconocido, se ignora su existencia
                        break;
                }
            }
        }

        // Devolver el resultado final
        return numeros.pop();
    }
}
