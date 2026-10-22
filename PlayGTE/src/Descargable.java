public interface Descargable {
    double calcularTamanoMB();

    // cada descarga puede comprobar si cabe por separado.
    default boolean cabeEn(double espacioLibreMB) {
        return calcularTamanoMB() <= espacioLibreMB;
    }
}
