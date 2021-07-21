package Assignment2;

import java.util.ArrayList;
import java.util.Collection;

public class ModificatedArrayList<E> extends ArrayList<E> {

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o){
        throw new UnsupportedOperationException();
    }
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }


}
