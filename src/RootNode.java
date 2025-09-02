public class RootNode<T extends Comparable<T>> {
    T data;
    //left and right extension of node
    RootNode<T> left;
    RootNode<T> right;

    public RootNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}