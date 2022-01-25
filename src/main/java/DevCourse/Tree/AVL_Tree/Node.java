package DevCourse.Tree.AVL_Tree;

public class Node {
        int key;
        int height;
        DevCourse.Tree.AVL_Tree.Node left;
        DevCourse.Tree.AVL_Tree.Node right;

        Node(int d)   {
            key = d;
            height = 1;
        }
        Node(){

        }
}
