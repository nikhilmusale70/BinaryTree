public class MyBinaryTree {
    public Node n;
    public Node createNewNode(int key){
        n = new Node();
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
        else if (key> node.key)
            node.rightNode = insert(node.rightNode, key);


        return node;
    }


}
