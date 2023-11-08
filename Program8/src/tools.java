//Jose Salcedo
import java.lang.Math;
public class tools {
    double counter=0;
    double heigthright = 0;
    double heigthleft = 0;
    double treeheight=0;
    static class Node{
       String word;
       Node left,right;
       public Node (String ins_word){
           word=ins_word;
           left=null;
           right=null;
       }

   }
   Node root=null;
    public void callinsert(String word){
        root=inserttree(root,word);
    }
   Node inserttree(Node root,String word){
        boolean flag = false;
      if (root == null){
          root= new Node(word);
          return root;
      } else if (word.equals(root.word)) {
          return root;
      } else if (flag == word.compareTo(root.word) > 0) {
          root.left=inserttree(root.left,word);
      } else if (flag==word.compareTo(root.word)<0) {
          root.right=inserttree(root.right,word);
      }
       return root;
   }
   void callpostOrder(){
        postOrder(root);
   }
   void postOrder(Node root){
       if (root!=null){
           postOrder(root.left);
           postOrder(root.right);
           counter++;
       }

   }

   double findheigthLeftsubtree(Node root){

        if (root!=null) {
            heigthleft++;
            findheigthLeftsubtree(root.left);
        }
    return heigthleft;
   }
    double findheigthRigthsubtree(Node root){
        if (root!=null) {
            heigthright++;
            findheigthRigthsubtree(root.right);
        }
        return heigthright;
    }
    double findheigth (){
        double l=findheigthLeftsubtree(root);
        double r=findheigthRigthsubtree(root);
        if (l>r){
            treeheight=l;
            return treeheight;
        }else {
            treeheight=r;
            return treeheight;
        }

    }

    public String[] CleanUp(String trash){
        String clean=trash;
        String n=clean.replaceAll("-"," ");
        String s= n.replaceAll("[^a-z ]","");
        return s.split(" ");
    }
    public double Maxnodes(){
        double max_n=Math.pow(2,treeheight);
        return max_n-1;

    }
}
