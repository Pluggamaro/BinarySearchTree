public class BinarySearchTree<T extends Comparable<T>> {
    //defining root
    private RootNode<T> root;
    
    public BinarySearchTree(){
        this.root = null;
    }

    //tree insertion
    public void insert(T data){
        root = insertRecursive(root, data);
    }

    //helper method for insertion
    private RootNode<T> insertRecursive(RootNode<T> currentNode, T newData){
        //if currentNode is null then newData is 
        if(currentNode == null){
            return new RootNode<>(newData);
        }

        //otherwise compare new data to root node for traversal route
        int compare = newData.compareTo(currentNode.data);

        //negatives on left side of tree and positives on right
        if(compare < 0){
            currentNode.left = insertRecursive(currentNode.left, newData);
        }
        return currentNode;
    }
}
