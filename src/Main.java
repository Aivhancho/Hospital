public class Main {
    public static void main(String[] args) {
        hospital hospital1 = new hospital("Hospital General", "Calle Principal, Ciudad");
        planta planta1 = new planta(1, "Trauma");
        Cama cama1 = new Cama(1, planta1);
        }
    }