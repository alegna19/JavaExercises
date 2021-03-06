package linkedlist;


public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfList;


    @Override
    public void insert(T data) {

        ++sizeOfList;
        if (root == null) {
            this.root = new Node<>(data);
        } else {
            insertDataAtBeginning(data);
        }

    }

    //O(1)
    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    //O(N)
    private void insertDataAtEnd(T data,  Node<T> node) {
        if(node.getNextNode() != null){
            insertDataAtEnd(data,node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traverseList(T data) {

    }

    @Override
    public int size() {
        return 0;
    }
}
