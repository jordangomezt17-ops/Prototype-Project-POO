package poo;
import java.util.ArrayList;
import java.util.List;


public class DirectorioMarcas {
    // Lista para almacenar los objetos de tipo Marca
    private List<Marca> listaMarcas;

    // Constructor que inicializa la lista
    public DirectorioMarcas() {
        this.listaMarcas = new ArrayList<>();
    }

    // Método para agregar una nueva marca a la lista
    public void agregarMarca(Marca marca) {
        listaMarcas.add(marca);
    }

    // Método para recorrer la lista y mostrar la información de todas las marcas
    public void mostrarDirectorio() {
        System.out.println("==================================================");
        System.out.println("          DIRECTORIO DE MARCAS REGISTRADAS        ");
        System.out.println("==================================================");

        if (listaMarcas.isEmpty()) {
            System.out.println("El directorio está vacío.");
        } else {
            // Uso de un bucle for-each para iterar sobre los objetos de la lista
            for (Marca marca : listaMarcas) {
                marca.mostrarInformacion();
            }
        }
    }

    public List<Marca> getListaMarcas() {
        return listaMarcas;
    }

    public void setListaMarcas(List<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }
}