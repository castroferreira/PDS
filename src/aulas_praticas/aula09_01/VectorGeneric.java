package aulas_praticas.aula09_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class VectorGeneric<T> {

    private T[] vec;
    private int nElem;
    private final static int ALLOC = 50;
    private int dimVec = ALLOC;

    @SuppressWarnings("unchecked")
    public VectorGeneric() {
        vec = (T[]) new Object[dimVec];
        nElem = 0;
    }

    public boolean addElem(T elem) {
        if (elem == null) {
            return false;
        }
        ensureSpace();
        vec[nElem++] = elem;
        return true;
    }

    private void ensureSpace() {
        if (nElem >= dimVec) {
            dimVec += ALLOC;
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) new Object[dimVec];
            System.arraycopy(vec, 0, newArray, 0, nElem);
            vec = newArray;
        }
    }

    public boolean removeElem(T elem) {
        for (int i = 0; i < nElem; i++) {
            if (vec[i].equals(elem)) {
                if (nElem - i - 1 > 0) // not last element
                {
                    System.arraycopy(vec, i + 1, vec, i, nElem - i - 1);
                }
                vec[--nElem] = null; // libertar último objecto para o GC
                return true;
            }
        }
        return false;
    }

    public int totalElem() {
        return nElem;
    }

    public T getElem(int i) {
        return (T) vec[i];
    }

    public Iterator<T> Iterator() {
        return (this).new VectorGenericIterator<T>();
    }

    public ListIterator<T> listIterator() {
        return (ListIterator<T>) (this).new VectorGenericListIterator<>(0);
    }

    public ListIterator<T> listIterator(int index) {
        return (ListIterator<T>) (this).new VectorGenericListIterator<>(index);
    }

    private class VectorGenericIterator<K> implements Iterator<K> {

        private int i;

        public VectorGenericIterator() {
            i = 0;
        }

        @Override
        public boolean hasNext() {
            return (i < nElem);
        }

        @Override
        public K next() {
            if (hasNext()) {
                return (K) VectorGeneric.this.vec[i++];
            }
            throw new IndexOutOfBoundsException("only " + nElem + " elements");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    private class VectorGenericListIterator<T> implements ListIterator<T> {

        private int position;

        public VectorGenericListIterator(int index) {
            this.position = index;
        }

        @Override
        public boolean hasNext() {
            return (position < nElem);
        }

        @Override
        public T next() {
            if (hasNext()) {
                return (T) VectorGeneric.this.vec[nextIndex()];
            }
            throw new IndexOutOfBoundsException("only " + nElem + " elements");
        }

        @Override
        public boolean hasPrevious() {
            return position > 0;
        }

        @Override
        public T previous() {
            if (hasPrevious()) {
                return (T) VectorGeneric.this.vec[--position];
            }
            throw new IndexOutOfBoundsException(position + "");
        }

        @Override
        public int nextIndex() {
            return position++;
        }

        @Override
        public int previousIndex() {
            return position--;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void set(T e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void add(T e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
