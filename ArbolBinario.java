public class ArbolBinario {
  protected Nodo raiz;
  public ArbolBinario() {
   raiz = null;
  }
  public void setArbolBinario(Nodo raiz) {
  this.raiz = raiz;
  }
  public Nodo raizArbol() {
  return raiz;
  }

  boolean esVacio() {
    return raiz == null;
  }
 
  public void insertar(int valor){
    raiz = insertarRecursivo(raiz, valor);
  }

  public Nodo insertarRecursivo(Nodo nodo , int valor){
    if ( nodo == null) {
      return new Nodo(valor);
    }
   if(valor <nodo.GetDato()) {
      nodo.SetRamaIzqda(insertarRecursivo(nodo.GetRamaIzqda(),valor));
    } else if (valor > nodo.GetDato()) {
      nodo.SetRamaDrc(insertarRecursivo(nodo.GetRamaDrc(), valor)); 
    }
    return nodo;
      
  
  }
  public void buscar(Nodo nodo , int buscar) {
    if ( nodo.GetDato() == buscar) {
      
    }
   if(buscar <nodo.GetDato()) {
      buscar(nodo.GetRamaIzqda(),buscar);
      System.out.println("Nodo visitado: " + nodo.GetDato());
    } else if (buscar > nodo.GetDato()) {
      buscar(nodo.GetRamaDrc(), buscar);
      System.out.println("Nodo visitado: " + nodo.GetDato()); 
    }
    
      
  }

  
 

 

  
  
  // Recorrido de un árbol binario en inorden
  public static void inorden(Nodo r) {
    if(r.GetRamaIzqda()!=null){
        inorden(r.GetRamaIzqda());
    }
    System.out.println(r.GetDato());
    if(r.GetRamaDrc()!=null){
        inorden(r.GetRamaDrc());
    }




    
  }
  // Recorrido de un árbol binario en postorden
  public static void postorden(Nodo r) {
    if(r!=null){
    postorden(r.GetRamaIzqda());
    postorden(r.GetRamaDrc());
    System.out.println(r.GetDato());
    }
 }
// Recorrido de un árbol binario en preorden
 public static void PreOrden (Nodo r){
    if(r == null){
        return;
    }
    else{
        System.out.print(r.GetDato());
        PreOrden(r.GetRamaIzqda());
        PreOrden(r.GetRamaDrc());
        return;
    }
 }

}

