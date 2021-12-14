 package estDat.estDatLin;


public class ListaSE<T> implements Lista<T>{
    private T ini;
    private ListaSE<T> sig;
    /*
     * construye una ListaSE vacia
     */
    
    public ListaSE(){
        ini = null;
        sig = null;
    }
    /**
     * vacia metodo que retorna true si la lista esta vacia caso contrario false
     */
    public boolean vacia(){
        return ini == null;
    };
    
    /* metodo insertar permite insertar el dato al final de la lista*/
    public void insertar(T dato){
        if(vacia()){
            ini = dato;
            sig = new ListaSE<T>();
        }else{
            sig.insertar(dato);
        }
    };
    
    /**
     * metodo eliminar permite eliminar el elemento de la posicion pos
     * si existeria y ademas lo retorna, si la posicion pos no existiera
     * entonces no cambia la estructura y devuelve null
     */
    public T eliminar(int pos){
        return null;
    };
     
    /**
     * metodo acceder permite acceder al elemento de la posicion si existiera,
     * caso contrario me devuel null.
     */
    public T acceder(int pos){
        return null;
    };
}
