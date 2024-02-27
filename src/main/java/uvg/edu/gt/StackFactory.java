package uvg.edu.gt;

public class StackFactory<T> {
    public UvgStack<T> crearStack(int id){
        switch (id){
            case 1:
                return new ArrayStack<T>();
            case 2:
                return new VectorStak<T>();
            case 3:
                return new DLLStack<T>();
            case 4:
                return new SLLStack<T>();
        }
        return null;
    }
}
