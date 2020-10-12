public interface Queue<E> {
        public void push (E e) throws FullQueueException;
        public E pop() throws EmptyQueuException;
        public int size();
}
