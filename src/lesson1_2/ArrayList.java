package lesson1_2;

public class ArrayList<T> implements List<T> {
    private int initialCapacity = 10;
    private int capacity = initialCapacity;
    private int count = 0;
    private Object[] data;

    public ArrayList() {
        data = new Object[capacity];
    }
    private int getNewCapacity() {
        return capacity * 2;
    }
    private void updateList(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }

    @Override
    public void add(T elem) {
        if (count == capacity) {
            updateList(getNewCapacity());
        }
        data[count] = elem;
        count++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return (T) data[index];
    }

    private class ArrayListIterator implements Iterator<T> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < count;
        }

        @Override
        public T next() {
            T value = (T) data[current];
            current++;
            return value;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
}
