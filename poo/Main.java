package poo;
public class Main {
    public static void main(String[] args) {
        // 1. Instanciación del gestor del directorio
        DirectorioMarcas miDirectorio = new DirectorioMarcas();

        // 2. Creación de los objetos Marca (Instanciación)
        Marca servientrega = new Marca(
                "Servientrega",
                "Logística y Mensajería",
                "Soluciones de logística y envíos a nivel nacional e internacional.",
                "Envío de paquetes, rastreo en línea, logística corporativa.",
                "Av. de las Américas, Guayaquil",
                "04-200-0000 | www.servientrega.com.ec",
                "Sistema de tracking en tiempo real, escáneres de código de barras.");

        Marca dal = new Marca(
                "Dal",
                "Alimentos / Supermercado",
                "Cadena de minimarkets con productos de primera necesidad.",
                "Venta de abarrotes, bebidas, snacks y limpieza.",
                "Urdesa Central, Guayaquil",
                "info@dal.ec",
                "Sistema de punto de venta (POS), control de inventarios.");

        Marca puntoSuerte = new Marca(
                "Punto de la Suerte",
                "Entretenimiento / Lotería",
                "Agencia de venta de pronósticos deportivos y lotería.",
                "Venta de boletos, recargas, pago de premios.",
                "Centro de Guayaquil",
                "099-123-4567",
                "Terminales de impresión térmica, conexión segura VPN a servidores centrales.");

        Marca barberia = new Marca(
                "Barbería El Elegante",
                "Cuidado Personal",
                "Servicios de barbería clásica y moderna para caballeros.",
                "Cortes de cabello, perfilado de barba, tratamientos capilares.",
                "La Alborada, Guayaquil",
                "IG: @barberia_elegante",
                "Software de agendamiento de citas, terminal de pagos con tarjeta.");

        Marca centroCopias = new Marca(
                "Centro de Copias Campus",
                "Servicios de Impresión",
                "Copias e impresiones de alta calidad para estudiantes y profesionales.",
                "Fotocopias, impresiones a color, anillados, plastificados.",
                "Campus ESPOL, Vía a la Costa",
                "098-765-4321",
                "Impresoras multifuncionales en red, software de gestión de cuotas de impresión.");

        Marca ecommerce = new Marca(
                "TechStore Ecommerce",
                "Comercio Electrónico",
                "Tienda en línea especializada en gadgets y tecnología.",
                "Venta de electrónicos, envíos a domicilio, soporte en línea.",
                "Operación Nacional (Sede Guayaquil)",
                "ventas@techstore.ec",
                "Plataforma web con pasarela de pagos, base de datos en la nube (AWS/Firebase).");

        // 3. Agregando los objetos a la lista del directorio
        miDirectorio.agregarMarca(servientrega);
        miDirectorio.agregarMarca(dal);
        miDirectorio.agregarMarca(puntoSuerte);
        miDirectorio.agregarMarca(barberia);
        miDirectorio.agregarMarca(centroCopias);
        miDirectorio.agregarMarca(ecommerce);

        // 4. Ejecutando el método para mostrar todas las marcas
        miDirectorio.mostrarDirectorio();
    }
}