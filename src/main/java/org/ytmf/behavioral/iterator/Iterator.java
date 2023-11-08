package org.ytmf.behavioral.iterator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 11:02
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
