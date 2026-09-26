package lesson1_2;

public class LinkedList<T> implements List<T> {
    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }
    private int count = 0;
    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        count++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }
    private class LinkedListIterator implements Iterator<T> {
        Node<T> current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
}
