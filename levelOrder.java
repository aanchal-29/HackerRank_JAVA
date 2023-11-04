//package hackerrank;
//
//
//import java.util.*;
//import java.io.*;
//
//class Node{
//    Node left,right;
//    int data;
//    Node(int data){
//        this.data=data;
//        left=right=null;
//    }
//}
//
//
//public class levelOrder{
//
//static void levelOrder(Node root){
//      //Write your code here
//      Queue<Node> queue = new LinkedList();
//    if(root != null) {
//        queue.add(root); // 3
//    }
//    
//    while(!queue.isEmpty()) {
//        
//        Node node = queue.poll();
//        System.out.print(node.data + " ");// 3 2 5 1 4 7
//        
//        if(node.left != null) {
//            queue.add(node.left);//2
//        }
//        if(node.right != null) {
//            queue.add(node.right);//5
//        }
//        
//    }
//
//    }
//
//public static Node insert(Node root,int data){
//        if(root==null){
//            return new Node(data);
//        }
//        else{
//            Node cur;
//            if(data<=root.data){
//                cur=insert(root.left,data);
//                root.left=cur;
//            }
//            else{
//                cur=insert(root.right,data);
//                root.right=cur;
//            }
//            return root;
//        }
//    }
//    public static void main(String args[]){
//            Scanner sc=new Scanner(System.in);
//            int T=sc.nextInt();
//            Node root=null;
//            while(T-->0){
//                int data=sc.nextInt();
//                root=insert(root,data);
//            }
//            levelOrder(root);
//        }	
//}
//
//
////6
////3
////5
////4
////7
////2
////1
////3 2 5 1 4 7 