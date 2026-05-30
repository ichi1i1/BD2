package bd2.Mappers;

import bd2.model.Venta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bson.Document;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class VentasMapper {
    private static final Gson gson = new Gson();

    public static Document toDocument(Venta venta) {
        String json = gson.toJson(venta);
        return Document.parse(json);
    }

    // Nuevo método para serializar y guardar la lista entera en un archivo
    public static void guardarVentasEnArchivoJson(List<Venta> ventas, String nombreArchivo) {
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String json = gsonPretty.toJson(ventas);
        
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(json);
            System.out.println("¡Archivo guardado exitosamente como: " + nombreArchivo + "!");
        } catch (IOException e) {
            System.err.println("Error al intentar guardar el archivo: " + e.getMessage());
        }
    }
}
