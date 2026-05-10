package poo;

public class Marca {
    // Atributos privados (Encapsulamiento)
    private String nombre;
    private String categoria;
    private String descripcion;
    private String serviciosPrincipales;
    private String direccion;
    private String contacto;
    private String requisitosTecnicos;

    // Constructor para inicializar el objeto Marca
    public Marca(String nombre, String categoria, String descripcion, String serviciosPrincipales,
            String direccion, String contacto, String requisitosTecnicos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.serviciosPrincipales = serviciosPrincipales;
        this.direccion = direccion;
        this.contacto = contacto;
        this.requisitosTecnicos = requisitosTecnicos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getServiciosPrincipales() {
        return serviciosPrincipales;
    }

    public void setServiciosPrincipales(String serviciosPrincipales) {
        this.serviciosPrincipales = serviciosPrincipales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getRequisitosTecnicos() {
        return requisitosTecnicos;
    }

    public void setRequisitosTecnicos(String requisitosTecnicos) {
        this.requisitosTecnicos = requisitosTecnicos;
    }

    // Método para mostrar la información de la marca en consola
    public void mostrarInformacion() {
        System.out.println("--------------------------------------------------");
        System.out.println("Marca: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Servicios: " + serviciosPrincipales);
        System.out.println("Dirección: " + direccion);
        System.out.println("Contacto: " + contacto);
        System.out.println("Requisitos: " + requisitosTecnicos);
        System.out.println("--------------------------------------------------");
    }
}