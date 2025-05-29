public class Main {
    public static void main(String[] args) {
        System.out.println("Arbol binario de busqueda de números enteros\n");
        ArbolBinario arbolBinario = new ArbolBinario(); 
        Nodo aux;
             try { 
             arbolBinario.insertar(10);
             arbolBinario.insertar(15);
             arbolBinario.insertar(7);
             arbolBinario.insertar(3);
             arbolBinario.insertar(9);
             arbolBinario.insertar(1);
             aux=arbolBinario.buscar(arbolBinario.raiz,15);
             if(aux!=null){
                System.out.println("Nodo encontrado: "+aux.GetDato());
             }else{
                System.out.println("Nodo no encontrado");
             }
             
             System.out.println("\npre orden");
             ArbolBinario.PreOrden(arbolBinario.getraizArbol());
             System.out.println("\nin orden");
            ArbolBinario.inorden(arbolBinario.getraizArbol());
             System.out.println("\npost orden");
             ArbolBinario.postorden(arbolBinario.getraizArbol());
             } catch (Exception e) {
                 System.out.println(e.getMessage());
                }



}
}  
