package ss10_list.bai_tap.MyArrayList;

public class MyList<E> {
    /**
     * Chưa hoàn thành
     **/
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {

    }

    public void add(int index, E element) {

    }

    public E remove(int index) {
        return (E) elements;
    }

    public int size() {
        return 0;

    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        return false;
    }

    public int indexOf() {
        return 0;
    }

    public boolean add(E e) {
        return false;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int i) {
        return (E) elements;
    }

    public void clear() {
    }
}

