public class MyBinaryTreeRunner {
    public static void main(String[] args) {
        MyBinaryTree bst = new MyBinaryTree();
        //comment
        Node root = null;
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 11);
        root = bst.insert(root, 3);
        root = bst.insert(root, 18);
        root = bst.insert(root, 60);
        root = bst.insert(root, 65);
        root = bst.insert(root, 95);
        root = bst.insert(root, 67);
        root = bst.insert(root, 63);


        int size = bst.sizeOfBst(root);
        System.out.println("Size of bst is :- "+ size);
    }
}
