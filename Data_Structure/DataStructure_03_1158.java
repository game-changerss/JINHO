package org.example.dataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class DataStructure_03_1158 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String command = br.readLine();

        int N = Integer.parseInt(command.split(" ")[0]);
        int K = Integer.parseInt(command.split(" ")[1]);

        Deque<Integer> queue = new LinkedList<>();
        for(int i=1; i<N+1; i++){
            queue.add(i);
        }
        String result ="<";

        for(int i=0;i<N;i++){
            if(i>0){
                result += ", ";
            }

            for(int j=0; j<K-1; j++){
                queue.add(queue.poll());
            }
            result += queue.poll();
        }
        result += ">";
        bw.write(result);
        bw.close();
    }

}
