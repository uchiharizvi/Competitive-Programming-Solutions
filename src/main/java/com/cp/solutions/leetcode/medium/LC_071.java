package com.cp.solutions.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Convert absolute path to canocial path
 * The canonical path should have the following format:
 * 1) The path starts with a single slash '/'.
 * 2) Any two directories are separated by a single slash '/'.
 * 3) The path does not end with a trailing '/'.
 * 4) The path only contains the directories on the path from the root directory to the target file or
 * directory (i.e., no period '.' or double period '..')
 * <p>
 * Algorithm
 **/
public class LC_071 {
    public static void main(String[] args) {

    }

    /**
     * Java Deque Approach
     * 2 MS
     * 42.2 MB
     **/
    public static String simplifyPath(String path) {

        Deque<String> queue = new ArrayDeque<String>();// Use deque data structure to store each part of the path
        StringBuilder p = new StringBuilder();// Store each part of file path temporarily as we read the string
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c != '/') {// If character is not /, add to string
                p.append(c);
            }
            // If character is / , or if we have reached end of the full string
            // AND if there is a part of the path which we haven't processed yet, process "p"
            if ((c == '/' || i == path.length() - 1) && p.length() > 0) {
                if (p.toString().equals("..")) {
                    if (!queue.isEmpty()) queue.pollLast();
                } else if (!p.toString().equals(".")) {
                    queue.offer(p.toString());
                }
                p.setLength(0);
            }
        }
        StringBuilder res = new StringBuilder();
        res.append("/");
        while (!queue.isEmpty()) {
            res.append(queue.poll());
            res.append("/");
        }
        if (res.length() > 1) {
            res.setLength(res.length() - 1);
        }
        return res.toString();
    }
}
