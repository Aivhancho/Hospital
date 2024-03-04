public class Cama {
    int numCama;
    Boolean estado = false;
    int numPlanta;
    planta planta1;
    public Cama(int numCama, planta planta1) {
        this.estado = false;
        this.planta1 = planta1;
        this.numCama = numCama;
    }
    public void ocuparCama(){
        this.estado = true;
    }
    public void desocuparCama(){
        this.estado = false;
    }

}
