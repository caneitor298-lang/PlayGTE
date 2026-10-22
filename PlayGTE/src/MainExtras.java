import java.util.ArrayList;
import java.util.List;

public class MainExtras {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Cielo de Xela", "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer", "Los Tecomates", 180);
        Podcast p1 = new Podcast("Código y Café", "Ana Ruiz", 1800, 12);
        LibroDigital l1 = new LibroDigital("Estructuras de Datos", "Marco Pérez", 320);

        List<Descargable> paraDescargar = List.of(c1, c2, p1, l1);
        double espacioLibreMB = 100;
        double totalMB = Main.espacioTotalMB(paraDescargar);

        System.out.println("Espacio libre: " + espacioLibreMB + " MB");
        System.out.println("Total de descargas: " + totalMB + " MB");
        System.out.println("¿Cabe todo junto? " + (totalMB <= espacioLibreMB));
        System.out.println("¿Cabe solo el libro? " + l1.cabeEn(espacioLibreMB));

        List<Reproducible> paraEscuchar = new ArrayList<>(List.of(c1, c2, p1));
        paraEscuchar.add(new Alarma());

        for (Reproducible r : paraEscuchar) {
            r.reproducir();
        }

        int seg = Main.tiempoTotalSeg(paraEscuchar);
        System.out.println("Tiempo con alarma: " + seg + " s = "
                + seg / 60 + " min " + seg % 60 + " s");
        System.out.println("tiempoTotalSeg() funciona sin modificarlo.");
    }
}
