public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList lista = new SinglyLinkedList(null);
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        System.out.println("-------------------------------------------");
        System.out.println("Buscar");
        lista.mostrar();
        lista.buscar(30);
        System.out.println("--------------------------------------------");
        System.out.println("Eliminar");
        lista.eliminar(10);
        lista.eliminar(20);
        lista.eliminar(30);
    }
}
