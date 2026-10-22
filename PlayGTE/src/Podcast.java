public class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;
    private int episodio;

    public Podcast(String titulo, String autor, int duracionSeg, int episodio) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public String tipo() {
        return "Podcast";
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    public int getEpisodio() {
        return episodio;
    }

    @Override
    public void reproducir() {
        System.out.printf("Reproduciendo podcast: %s, episodio %d (%d:%02d)%n",
                getTitulo(), episodio, duracionSeg / 60, duracionSeg % 60);
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.0;
    }
}
