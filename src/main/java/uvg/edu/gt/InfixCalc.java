package uvg.edu.gt;

public class InfixCalc {
    private MyPfCalc pfCalc;
    private static InfixCalc calc;
    private UvgStack<Integer> pilaI;
    private UvgStack<String> pilaS;

    private UvgStack<Character> pilaC;
    private InfixCalc(UvgStack<Integer> pilaI,UvgStack<String> pilaS, UvgStack<Character> pilaC){
        this.pilaI = pilaI;
        this.pilaS = pilaS;
        this.pilaC = pilaC;
        this.pfCalc = new MyPfCalc(pilaI);
    }

    public InfixCalc getInfixcalc(UvgStack<Integer> pilaI,UvgStack<String> pilaS, UvgStack<Character> pilaC ){
        if (calc == null){
            calc = new InfixCalc(pilaI , pilaS , pilaC);
        }
        return calc;
    }

    public Integer calcular(String operacion){
        String posxix = InfixToPostfix.infixToPostfix(operacion, pilaC);
        return pfCalc.calc(posxix);
    }
}
