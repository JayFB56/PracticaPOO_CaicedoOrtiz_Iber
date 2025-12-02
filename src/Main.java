import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Agregamos diferentes tipos de pedidos
        pedidos.add(new PedidoPizza("Juan", "Calle 1", 120.0, true, "Delgada", new String[]{"Queso", "Jamon", "Tomate"}));
        pedidos.add(new PedidoHamburguesa("Ana", "Calle 2", 90.0, false, "Res", true));
        pedidos.add(new PedidoPizza("Luis", "Calle 3", 150.0, true, "Gruesa", new String[]{"Pepperoni", "Queso"}));
        pedidos.add(new PedidoHamburguesa("Maria", "Calle 4", 80.0, true, "Pollo", false));

        // Mostrar detalles de cada pedido
        for (Pedido pedido : pedidos) {
            pedido.mostrarDetallesEspeciales();
            System.out.println();
        }

        // Reporte final
        System.out.println("==== Reporte de todos los pedidos ====");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente() + ", Tipo: " + pedido.getTipo() + ", Delivery: " + (pedido.isDelivery() ? "Si" : "No"));
        }
    }
}
