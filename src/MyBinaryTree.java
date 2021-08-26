public class MyBinaryTree {

    public Node createNewNode(int key){
        Node n = new Node();
        n.key=key;
        n.leftNode=null;
        n.rightNode=null;

        return n;
    }

    public Node insert(Node node, int key){
        if (node==null){
            return createNewNode(key);
        }

        if (key<node.key)
            node.leftNode = insert(node.leftNode, key);
        else if (key< node.key)
            node.rightNode = insert(node.rightNode, key);


        return node;
    }
}
