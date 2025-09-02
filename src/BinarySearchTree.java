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
        }else if(compare > 0){
            currentNode.right = insertRecursive(currentNode.right, newData);
        }

        return currentNode;
    }

    //tree search method
    public boolean search(T data) {
        return false;
    }

    //recursive search helper
    private boolean searchRecursive(RootNode<T> currentNode, T newData){
        //base case
        if(currentNode == null){
            return false;
        }

        //data found 
        if(newData.equals(currentNode.data)){
            return true;
        }

        return newData.compareTo(currentNode.data) < 0 
            ? searchRecursive(currentNode.left, newData)
            : searchRecursive(currentNode.right, newData);
    }

    public void delete(T data){
        root = deleteRecursive(root, data);
    }

    private RootNode<T> deleteRecursive(RootNode<T> currentNode, T newData){
        if(currentNode == null){
            return null;
        }

        int compare = newData.compareTo(currentNode.data);

        //avigating node of deletion
        if(compare < 0){
            currentNode.left = deleteRecursive(currentNode.left, newData);
        }else if(compare > 0){
            currentNode.right = deleteRecursive(currentNode.right, newData);
        }else{

        }

        return currentNode;
    }

}
