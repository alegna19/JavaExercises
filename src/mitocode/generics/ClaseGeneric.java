package mitocode.generics;

public class ClaseGeneric<T, K, V, E> {

    private T objectT;
    private K objectK;
    private V objectV;
    private E objectE;

    public ClaseGeneric(T objectT, K objectK, V objectV, E objectE) {
        this.objectT = objectT;
        this.objectK = objectK;
        this.objectV = objectV;
        this.objectE = objectE;
    }

    public void showType() {
        System.out.println("T is an: " + objectT.getClass().getName());//muestra la clase a la que corresponde ese objeto.
        System.out.println("K is an: " + objectK.getClass().getName());//muestra la clase a la que corresponde ese objeto.
        System.out.println("V is an: " + objectV.getClass().getName());//muestra la clase a la que corresponde ese objeto.
        System.out.println("E is an: " + objectE.getClass().getName());//muestra la clase a la que corresponde ese objeto.
    }

    public T getObjectT() {
        return objectT;
    }

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public K getObjectK() {
        return objectK;
    }

    public void setObjectK(K objectK) {
        this.objectK = objectK;
    }

    public V getObjectV() {
        return objectV;
    }

    public void setObjectV(V objectV) {
        this.objectV = objectV;
    }

    public E getObjectE() {
        return objectE;
    }

    public void setObjectE(E objectE) {
        this.objectE = objectE;
    }
}
