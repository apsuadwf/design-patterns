package org.ytmf.behavioral.iterator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 11:07
 */
public class IntArray implements Aggregate{
    private int[] values;

    public IntArray(int[] values) {
        this.values = values;
    }

    public int getValueAt(int index){
        return values[index];
    }

    public int getLength() {
        return values.length;
    }

    @Override
    public Iterator iterator() {
        return new IntArrayIterator<Integer>(this);
    }
}
