public class MyBinaryTree {
    int flag = 0;
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
        else if (key> node.key)
            node.rightNode = insert(node.rightNode, key);
        return node;
    }

    public int sizeOfBst(Node node){
        if (node == null)
            return 0;
        else
            return (sizeOfBst(node.leftNode) + sizeOfBst(node.rightNode) + 1 );

    }

    public int search(Node node, int key){
        if (node.key == key){
            flag++;
        }
        else if (key > node.key ){
            search(node.rightNode, key);
        }
        else if (key < node.key){
            search(node.leftNode, key);
        }
        return flag;
    }

}
