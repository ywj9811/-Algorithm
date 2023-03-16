package Baekjoon.baekjoon_datastructure;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class B_11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        //큰 값으로 우선순위를 잡는다.

        for (int i = 0; i < count; i++) {
            int order = Integer.parseInt(br.readLine());
            if (order == 0) {
                if (priorityQueue.isEmpty()) {
                    bw.write("0\n");
                    continue;
                }
                bw.write(priorityQueue.poll().toString() + "\n");
                continue;
            }
            priorityQueue.add(order);
        }

        bw.close();
        br.close();
    }
}
