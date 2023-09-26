package util;

public class ArrayTest <T> implements List<T>{
    private Object[]  array;

    public ArrayTest(Object[] array) {
        this.array = new Object[100];
    }
//    @Override
    public T get(int index) {
        return (T) array[index];
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public T[] findAll() {
        return (T[]) array;
    }

    @Override
    public T findById(int index) {
        for(Object o:array){
            if(o!=null){
                T t = (T) o;
            }
        }
        return null;
    }
    @Override
    public void add(T t) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index,T t) {

    }
}
