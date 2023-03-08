package org.example.dataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class DataStructure_04_2164 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> queue = new LinkedList<>();

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 1; i<cnt+1; i++){
            queue.add(i);
        }
        while (queue.size() != 1){
            queue.poll();
            queue.add(queue.poll());
        }
        bw.write(queue.poll()+"\n");
        bw.close();
    }

}
