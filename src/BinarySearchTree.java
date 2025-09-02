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

        //navigating node of deletion
        if(compare < 0){
            currentNode.left = deleteRecursive(currentNode.left, newData);
        }else if(compare > 0){
            currentNode.right = deleteRecursive(currentNode.right, newData);
        }else{
            //an empty node with no children
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }

            //if right node is empty brign forth left node vice versa
            if(currentNode.right == null){
                return currentNode.left;
            }

            if(currentNode.left == null){
                return currentNode.right;
            }

            //if node has both children left and right, then find in-order successor

            T lowestValue = findSmallest(currentNode.right);
            //replacing current node with successor from above
            currentNode.data = lowestValue;
            //now deleting from the right node
            currentNode.right = deleteRecursive(currentNode.right, lowestValue);

        }

        return currentNode;
    }

    // recursive helper method for finding lowest value on the left-most side

    private T findSmallest(RootNode<T> root){
        return root.left == null ? root.data :findSmallest(root.left);
    }

    //traversals

    public void inOrder(){
        //order should be left -> root -> right
    }

    public void preOrder(){
        //order is root -> left -> right
    }

    public void postOrder(){
        //ultimately left -> right -> root
    }


}
