package uvg.edu.gt;



public class InfixToPostfix {

    // Función para verificar si un carácter es un operador
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Función para obtener la precedencia de un operador
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Función para convertir la expresión infix a postfix
    public static String infixToPostfix(String infix, UvgStack<Character> stack) {
        StringBuilder postfix = new StringBuilder();
        // Agregar un carácter especial (#) al inicio de la pila
        stack.push('#');

        // Iterar sobre cada carácter de la expresión infix
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                // Si el carácter es alfanumérico, añadirlo directamente al postfix
                postfix.append(" ");
                postfix.append(ch);
            } else if (ch == '(') {
                // Si el carácter es '(' simplemente apilarlo

                stack.push(ch);
            } else if (ch == '^') {
                // Si el carácter es '^', apilarlo directamente
                stack.push(ch);
            } else if (ch == ')') {
                // Si el carácter es ')', desapilar y añadir a postfix hasta encontrar '('
                while (stack.top() != '(') {
                    postfix.append(" ");
                    postfix.append(stack.pop());
                }
                stack.pop(); // Desapilar '(' también
            } else {
                // Si el carácter es un operador, realizar comparaciones de precedencia
                while (stack.top() != '#' && precedence(ch) <= precedence(stack.top())) {
                    postfix.append(" ");
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Desapilar cualquier operador restante de la pila
        while (stack.top() != '#') {
            postfix.append(" ");
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

}
