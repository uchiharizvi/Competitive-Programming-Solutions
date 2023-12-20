package com.cp.solutions.hackerearth;

import java.util.Scanner;

/**Two friends Kunal and Satyam are playing an interesting game. They take turns drawing a ball from a bag
 * which initially contains R red balls and G green balls. Each player draws a ball alternatively and never put it
 * back. The person who is the first to draw a red balls wins. Satyam always draws first.
 * If there are no more balls in the bag and nobody has drawn a red ball, the satyam wins.
 What is the probability of the Satyam winning?

 Input:
 The first line will contain the number of test cases T.
 The first line of each test case will contain a number R (number of red balls) and G(number of green balls )
 Output
 For each testcase, print the desired probability.
 Constraints:
 1<=T<=10
 0<=R,G<=10^3

 SAMPLE INPUT   | SAMPLE OUTPUT
 3              |   0.666667
 2 1            |   0.500000
 1 1            |   1.000000
 10 0           |


 **/

public class WinTheGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hi, " + name + ".");
    }

    public void doCalculation(int testNumber, Scanner s) {
        int r = s.nextInt();
        int g = s.nextInt();
        double probablilty = (double)r/(double)(r+g);

        if(g==0 || r==0){
            probablilty = 1;
            System.out.println(probablilty);
        }

    }

}

/*
/** import java.io.OutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.PrintWriter;
 import java.util.StringTokenizer;
 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.InputStream;

 /**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        WintheGame solver = new WintheGame();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class WintheGame {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int r = in.nextInt();
            int g = in.nextInt();
            double ans = (double) r / (double) (r + g);

            if (g == 0 || r == 0) {
                ans = 1;
                out.printf("%.6f\n", ans);

                return;
            }
            double a[] = new double[100000];
            int i = 1;
            a[0] = 1;
            while (g >= 2) {

                a[i] = a[i - 1] * ((double) g / (r + g)) * (double) (g - 1) / (r + g - 1);
//                out.println(a[i]);
                g--;
                g--;
                ans = ans + a[i] * (double) r / (double) (r + g);
                i++;


            }
            out.printf("%.6f\n", ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

*/