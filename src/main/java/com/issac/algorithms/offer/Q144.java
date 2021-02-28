package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q144 {
    public static List<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Stack<Command> stack = new Stack<Command>();
        stack.push(new Command("go",root));
        while (!stack.isEmpty()) {
            Command command = stack.pop();
            if(command.s == "print") {
                res.add(command.node.data);
            }
            else {
                assert command.s == "go";
                if(command.node.right != null) {
                    stack.push(new Command("go", command.node.right));
                }
                if(command.node.left != null) {
                    stack.push(new Command("go", command.node.left));
                }
                stack.push(new Command("print",command.node));
            }
        }
        return res;
    }
}

class Command {
    String s;
    TreeNode node;

    public Command(String s, TreeNode node) {
        this.s = s;
        this.node = node;
    }
}
