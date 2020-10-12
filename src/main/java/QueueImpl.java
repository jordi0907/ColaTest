//<E> para que cualquiera pueda parametrizarlo
//implementado con un vector

import java.util.Arrays;

public class QueueImpl<E> implements Queue<E> {
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        this.data = (E[]) new Object[len];
        this.p = 0;
    }

    public void push(E e) throws FullQueueException {
        if (this.estaplena()) throw new FullQueueException();
        this.data[this.p++] = e;
    }

    private boolean estaplena() {

        return this.p >=this.data.length;
    }

    public E pop() throws EmptyQueuException {
        if (this.estabuida()) throw  new EmptyQueuException();
        //retorno la primera posicion
        E e = this.data[0];
        for (int i=0; i<this.p;i++){
            this.data[i] = this.data[i+1];
        }
        //ahora la primera posicion esta vacia todos a la iquierda
        //lshift();
        this.p--;
        return e;
    }

    private void lshift() {
    }

    private boolean estabuida() {
        return this.p==0;
    }

    public int size() {
        return this.p;
    }

    @Override
    public String toString() {
        return "QueueImpl{" +
                "data=" + Arrays.toString(data) +
                ", p=" + p +
                '}';
    }
}
