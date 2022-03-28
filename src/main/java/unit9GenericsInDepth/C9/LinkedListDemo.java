package unit9GenericsInDepth.C9;

public class LinkedListDemo {

    public static void main(String[] args) {
        DataNode<Integer> node2 = new DataNode<Integer>(20, null); // Redundant <Integer> on the right side
        DataNode<Integer> node1 = new DataNode<>(35, node2);

        System.out.println(node1); // Out: DataNode{data=35, next=DataNode{data=20, next=null}}

        DataNode<Number> node11 = new DataNode<>(35.8, null);
        // node11.setNext(node2); // That is a mistake because DataNode<Number> is different to DataNode<Integer>

        /**
         * The previous problem is solved with wildcards
         */
        DataNodeWildcards<Integer> node222 = new DataNodeWildcards<>(20, null);
        DataNodeWildcards<Number> node111 = new DataNodeWildcards<>(35.8, null);

        node111.setNext(node222);

        System.out.println(node111);
    }
}
