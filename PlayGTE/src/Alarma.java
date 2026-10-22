// La alarma puede reproducirse sin pertenecer a la jerarquía Contenido.
public class Alarma implements Reproducible {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo alarma: ¡a despertar!");
    }

    @Override
    public int getDuracionSeg() {
        return 10;
    }
}
