public class SegundaParte {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.anadirpuerta();
        System.out.println("El numero de puertas del coche es: " + miCoche.puertas);
    }

}

class coche {
    public int puertas = 4;
    public void anadirpuerta () {
        this.puertas++;
    }
}

