public class App {
    public static void main(String[] args) throws Exception {
        //Instantiating BST with type Integer
        BinarySearchTree<Integer> binarySearchObject = new BinarySearchTree<>();

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

        System.out.println("Search :" + binarySearchObject.search(40) ? "FOUND!" : "NOT FOUND!");
    }
}
