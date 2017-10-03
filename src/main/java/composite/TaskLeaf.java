package composite;

public class TaskLeaf extends TaskComponent {
    private int valor;

    public TaskLeaf(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Leaf[" + this.valor + "]";
    }

    @Override
    public String view() {
        return toString();
    }

    @Override
    public void add(TaskComponent taskComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public int numberOfTaskComponents() {
        return 1;
    }

}
