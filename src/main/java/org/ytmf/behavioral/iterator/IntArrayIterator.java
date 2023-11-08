package org.ytmf.behavioral.iterator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 11:03
 */
public class IntArrayIterator<T> implements Iterator<Integer> {
    private IntArray intArray;
    private int index;

    public IntArrayIterator(IntArray intArray) {
        this.intArray = intArray;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < intArray.getLength();
    }

    @Override
    public Integer next() {
        int value = intArray.getValueAt(index++);
        return value;
    }
}
