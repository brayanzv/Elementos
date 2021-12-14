package estDat.estDatLin;


/**
 * Write a description of class NodoDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoDE<T>
{
    private NodoDE<T> ant, suc;
    private T dato;
    public NodoDE(T dato){
        ant = suc = null;
        this.dato = dato;
    }
    public NodoDE<T> getAnt(){
        return ant;
    }
    
    public NodoDE<T> getSuc(){
        return suc;
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setSuc(NodoDE<T> s){
        suc=s;
    }
    
    public void setAnt(NodoDE<T> a){
        ant=a;
    }
    
    public void setDato(T dato){
        this.dato=dato;
    }
    
}
