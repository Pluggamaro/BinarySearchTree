public class App {
    public static void main(String[] args) throws Exception {
        //Instantiating BST with type Integer
        BinarySearchTree<Integer> binarySearchObject = new BinarySearchTree<>();

        System.out.println("****************BINARY SEARCH TREE****************");
        System.out.println("========Node INSERTION========");
        binarySearchObject.insert(50);
        binarySearchObject.insert(30);
        binarySearchObject.insert(70);
        binarySearchObject.insert(20);
        binarySearchObject.insert(40);
        binarySearchObject.insert(60);
        binarySearchObject.insert(80);

        binarySearchObject.inOrder();

        System.out.println("========Searching TREE========");

        System.out.println("Search 40 :" + (binarySearchObject.search(40) ? "FOUND!" : "NOT FOUND!"));
        System.out.println("Search 90 :" + (binarySearchObject.search(90) ? "FOUND!" : "NOT FOUND!"));

        System.out.println("========Delete NODES========");
        System.out.println("Deleting 20...");

        binarySearchObject.delete(20);
        binarySearchObject.inOrder();

        System.out.println("====DELETE ROOT====");
        System.out.println("Deleting 50...");
        binarySearchObject.delete(50);
        binarySearchObject.inOrder();

        System.out.println("========PRE-ORDER========");
        binarySearchObject.preOrder();

        System.out.println("========POST-ORDER========");
        binarySearchObject.postOrder();
    }
}
