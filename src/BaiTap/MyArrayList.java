package BaiTap;

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {
    private final Object[] data = {};

    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        this.data = objects;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public boolean remove(E e) {
        int indexDel = indexOf(e);
        if(indexDel==-1){
                      return false;
        }
        for(int i = indexDel;i<size-1;i++){
            data[i]=data[i+1];
        }
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean isEmtry() {
        return false;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }
}
