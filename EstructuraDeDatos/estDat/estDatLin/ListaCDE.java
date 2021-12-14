package estDat.estDatLin;


/**
 * Write a description of class ListaCDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaCDE<T> implements Lista<T>{
    private NodoDE<T> ini;
    
    /*
     * contruye una listaCDE vacia
     */
    public ListaCDE(){
        ini = null;
    }
    
    /**
     * vacia metodo que retorna true si la lista esta vacia caso contrario false
     */
    public boolean vacia(){
        return ini == null;
    };
    
    /* metodo insertar permite insertar el dato al final de la lista*/
    public void insertar(T dato){
        NodoDE<T> p,ult;
        p = new NodoDE<T>(dato);
        if(vacia()){
            ini=p;
            ini.setSuc(ini);
            ini.setAnt(ini);
        }else{
            ult=ini.getAnt();
            ult.setSuc(p);
            p.setAnt(ult);
            p.setSuc(ini);
            ini.setAnt(p);
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
