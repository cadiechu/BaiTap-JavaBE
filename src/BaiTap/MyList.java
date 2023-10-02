package BaiTap;

public interface MyList<E> {
    void add(E e);
    void add(int index, E e);
    void clear();
    boolean contains( E e);
    int indexOf(E e);
    E get(int index);
    boolean isEmtry();
    int lastIndexOf(E e);
    boolean remove(int index);
    E set(int index, E e);
}
