public class Nodo {
    private int dato;
    private Nodo ramaIzqda;
    private Nodo ramaDrc;

    public Nodo(int valor){
        this.dato = valor;
        this.ramaIzqda = null;
        this.ramaDrc = null;
    }

    public int  GetDato() {
        return dato;
    }
    public void SetDato(int valor) {
        this.dato = valor;
    }
    public Nodo GetRamaIzqda() {
        return ramaIzqda;
    }
    public void SetRamaIzqda(Nodo ramaIzqda) {
        this.ramaIzqda = ramaIzqda;
    }
    public Nodo GetRamaDrc() {
        return ramaDrc;
    }
    public void SetRamaDrc(Nodo ramaDrc) {
        this.ramaDrc = ramaDrc;
    }


}
