public class LibroDigital extends Contenido implements Descargable {
    private int paginas;

    public LibroDigital(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String tipo() {
        return "Libro digital";
    }

    @Override
    public double calcularTamanoMB() {
        return paginas * 0.2;
    }
}

