public class SinglyLinkedList {
    Nodo cabeza;

    //Lo inicializamos en nulo
    public SinglyLinkedList(Nodo cabeza){
        this.cabeza=null; 
    }
    public void insertar(Integer dato){
        //Crear un nodo
        Nodo nuevoNodo= new Nodo(dato);
        //Verificar si la lista esta vacia
        if(cabeza==null){
            //Coloca el nuevo nodo como cabeza
            cabeza=nuevoNodo;
        }else{
            //Iniciamos desde la cabeza (el primero)
            Nodo tem = cabeza;
            //Recorremos todos los nodos hasta encontrar un null en las posiciones
            while (tem.getSiguiente() != null) {
                tem = tem.getSiguiente();
            }
            tem.setSiguiente(nuevoNodo);
        }
    }
    public void mostrar(){
        Nodo tem = cabeza;//Comenzamos desde la cabeza (inicio)
        //mientars tem no sea nulo
        while(tem != null){
            System.out.print(tem.getDato()+"->");
            tem=tem.getSiguiente();
        }
        System.out.println("null");
    }
    public boolean buscar(Integer valor){
        if (cabeza==null) {
            System.out.println("La lista esta vacia");
        }else{
            Nodo tem = cabeza;
        while(tem != null){
            
            if (tem.getDato() == valor) {
                System.out.println("Se ha encontrado el nodo");
                return true;
            }
            tem = tem.getSiguiente();
        }
        System.out.println("El nodo con el valor buscado no esta en la lista");
        }
        return  false;
    }
    public  void eliminar(Integer valor){
        if (cabeza==null) {
            System.out.println("No se puede eliminar porque la lista esta vacia");
        }
        if (cabeza.getDato()==valor) {
            cabeza=cabeza.getSiguiente();
            System.out.println("Se elimino correctamente: "+valor);
            return;
        }
        Nodo temp=cabeza;
        Nodo anterior=null;
        while (temp!=null && temp.getDato()!=valor) {//recorre hasta encontrar el nodo con el valor
            anterior=temp;
            temp=temp.getSiguiente();
        }
        if (temp==null) {
            System.out.println("No se encontro el valor");
            return;
        }
        anterior.setSiguiente(temp.getSiguiente());
        System.out.println("Se elimino correctamente"+valor);
    }
}
