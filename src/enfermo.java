public class enfermo {
    String nombrePaciente;
    int numSeguro;
    int cama;
    private Medico medicoAsignado;
    private Cama camaAsignada;

    public enfermo() {}
public void asignarCama(Cama cama){
        this.camaAsignada = cama;
    }
    public void desasignarCama(Cama cama){
        if (this.camaAsignada != null){
            this.camaAsignada = null;
        } else {
            System.out.println("No tiene ninguna cama asignada.");
        }
    }
public void asignarMedico(Medico medico){
        this.medicoAsignado = medico;
    }
}
