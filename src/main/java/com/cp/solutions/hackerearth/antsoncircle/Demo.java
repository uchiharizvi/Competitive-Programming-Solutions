package com.cp.solutions.hackerearth.antsoncircle;

import java.io.IOException;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //sample code
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        List<Integer> posList = new ArrayList<>();
        Map posMap = new HashMap<Integer, Integer>();
        Integer N = scan.nextInt();//marks in a circle
        Integer M = scan.nextInt();//Number of Ants
        Integer T = scan.nextInt();//T seconds
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt();//start pos
            int y = scan.nextInt();//direction:- if +ve, clockwise, if-ve anti-clockwise
            //distance between marks =  1 second of ants movement
            posMap.put(x, y);
            posList.add(x);
        }
        int position = calculateMovement(posList, posMap);
        //posList.add(position);


        //Collections.sort(posList);
        /*for (Integer elem : posList) {
            System.out.print(elem + " ");
        }*/


    }

    private static int calculateMovement(List<Integer> positions, Map movement) {
        int result = 0;
        List<Integer> solutionList = new ArrayList<>();
        Iterator<Map.Entry<Integer, String>> iterator = movement.entrySet().iterator();
        for (Integer positon : positions) {
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = iterator.next();
                if ((positon + (int) movement.get(positon)) == entry.getKey()){
                    solutionList.add(positon);
                }
            }
                solutionList.add(positon + (int) movement.get(positon));
        }
        Collections.sort(solutionList);
        System.out.println(solutionList);
        return result;
    }
}
