package BaekJoon.number;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1991
//트리 순회
public class algo_1991 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] data = br.readLine().replaceAll(" ","").toCharArray();

        Tree t = new Tree(data[0],data[1],data[2]);

        for(int i = 1; i < n; i++) {
            data = br.readLine().replaceAll(" ","").toCharArray();
            t.add(data[0],data[1],data[2]);
        }
        t.pre_order(t.root);
        System.out.println();
        t.in_order(t.root);
        System.out.println();
        t.post_order(t.root);

    }
}
class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(char data){
        this.data = data;
    }
}

class Tree{
    TreeNode root;

    public Tree(char data, char left, char right){
        root = new TreeNode(data); //시작 노드

        if(data != '.') {
            root = new TreeNode(data);
        }
        if(left != '.'){
            root.left = new TreeNode(left);
        }
        if(right != '.'){
            root.right = new TreeNode(right);
        }
    }

    public void add(char data,char left,char right){
        next(root.left,data,left,right);
        next(root.right,data,left,right);
    }

    public void next(TreeNode node, char data, char left,char right){
        if(node == null) return;

        if(node.data == data) {
            if(left != '.'){
                node.left = new TreeNode(left);
            }
            if(right != '.'){
                node.right = new TreeNode(right);
            }
        }else {
            next(node.left,data,left,right);
            next(node.right,data,left,right);
        }
    }

    public void pre_order(TreeNode node){
        System.out.print(node.data);

        if (node.left != null)
            pre_order(node.left);

        if (node.right != null)
            pre_order(node.right);
    }

    public void in_order(TreeNode node){
        if (node.left != null)
            in_order(node.left);

        System.out.print(node.data);

        if (node.right != null)
            in_order(node.right);
    }

    public void post_order(TreeNode node){
        if (node.left != null)
            post_order(node.left);

        if (node.right != null)
            post_order(node.right);

        System.out.print(node.data);
    }
}

