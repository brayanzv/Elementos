package estDat.estDatLin;

public interface Lista<T>
{
    /**
     * vacia metodo que retorna true si la lista esta vacia caso contrario false
     */
    public boolean vacia();
    
    /* metodo insertar permite insertar el dato al final de la lista*/
    public void insertar(T dato);
    
    /**
     * metodo eliminar permite eliminar el elemento de la posicion pos
     * si existeria y ademas lo retorna, si la posicion pos no existiera
     * entonces no cambia la estructura y devuelve null
     */
    public T eliminar(int pos);
    
    /**
     * metodo acceder permite acceder al elemento de la posicion si existiera,
     * caso contrario me devuel null.
     */
    public T acceder(int pos);
}
