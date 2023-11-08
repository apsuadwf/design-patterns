package org.ytmf.behavioral.iterator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 11:12
 */
public class Client {
    public static void main(String[] args) {
        IntArray intArray = new IntArray(new int[]{1, 2, 3, 4, 5});
        Iterator iterator = intArray.iterator();
        while (iterator.hasNext()){
            Integer next = (Integer) iterator.next();
            System.out.println(next);
        }
    }
}
