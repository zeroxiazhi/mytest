package array;

import java.util.Arrays;

public class ArrayNode {
    private int[] node = new int[3];
    private ArrayNode next;

    public ArrayNode() {
    }

    public ArrayNode(int i0,int i1,int i2) {
        node[0]=i0;
        node[1]=i1;
        node[2]=i2;
    }

    @Override
    public String toString() {
        return "ArrayNode{" +
                "node=" + Arrays.toString(node) +
                '}';
    }

    public int[] getNode() {
        return node;
    }

    public void setNode(int[] node) {
        this.node = node;
    }

    public ArrayNode getNext() {
        return next;
    }

    public void setNext(ArrayNode next) {
        this.next = next;
    }
}
