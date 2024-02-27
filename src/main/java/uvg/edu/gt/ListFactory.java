package uvg.edu.gt;

public class ListFactory<T> {
    public UvgList<T> crearLista(int id){
        if (id == 1){
            return new SLL<T>();
        }
        else if (id == 2) {
            return new DLL<T>();
        }
        else{
            return null;
        }
    }
}
