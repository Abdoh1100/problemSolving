package com.mvc.problems.interviewList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;

    }
    public String toString(){
        return this.val+"";
    }
}
class solution{

    public static int maxDepth(TreeNode head){
        if(head==null)
            return 0;
        int left=1+maxDepth(head.left);
        int right=1+maxDepth(head.right);
        return Math.max(left,right);
    }
    public static String printTree(TreeNode root){
        if(root==null)
            return "";
        StringBuilder sb=new StringBuilder();
        sb.append(root.val)
                .append(" left: ").append(printTree(root.left))
                .append(" right: ")
                .append(printTree(root.right));
        return sb.toString();
    }
    public static void main(String[]args){

        TreeNode root=new TreeNode(3
                ,new TreeNode(9,null,null)
                ,new TreeNode(20
                ,new TreeNode(15,null,null)
                ,new TreeNode(7,null,null)));
        System.out.println(maxDepth(root));
//        System.out.println(printTree(root));
    }
}
public class maximumDepthBT {
}
