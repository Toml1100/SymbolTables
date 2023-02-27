package edu.greenriver.sdev333;

/**
 * Binary search (in an ordered array implementation) of Symbol Table
 * Refer to p. 374-377 in Sedgewick and Wayne, Algorithms, 4th edition
 * @param <KeyType>
 * @param <ValueType>
 */
public class BinarySearchST<KeyType extends Comparable<KeyType>, ValueType> implements OrderedSymbolTable<KeyType, ValueType> {
    private KeyType[] keys;
    private ValueType[] vals;
    private int n;
    public BinarySearchST(int capacity){
        keys = (KeyType[]) new Comparable[capacity];
        vals = (ValueType[]) new Object[capacity];
    }
    @Override
    public void put(KeyType key, ValueType value) {

    }


    @Override
    public ValueType get(KeyType key) {
        if(isEmpty()){
            return null;
        }
        int i = rank(key);
        if(i < n && keys[i].compareTo(key) == 0){
            return vals[i];
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public KeyType min() {
        return null;
    }

    @Override
    public KeyType max() {
        return null;
    }

    @Override
    public KeyType floor(KeyType key) {
        return null;
    }

    @Override
    public KeyType ceiling(KeyType key) {
        return null;
    }

    @Override
    public int rank(KeyType key) {
        return 0;
    }

    @Override
    public KeyType select(int k) {
        return null;
    }

    @Override
    public Iterable<KeyType> keys() {
        return null;
    }
}
