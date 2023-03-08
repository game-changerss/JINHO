package org.example.dataStructure;

import java.io.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DataStructure_08_2346__ {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");
        Deque<String> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<cnt; i++){
            queue.add(list[i]);
        }
        int[] resultList = new int[cnt];
        int count = 0;
        String temp = queue.poll();
        for(int i=0; i<cnt; i++){
            map.put(temp, i+1);
//            resultList[i] = map.get(temp);
            int aaa = 1;
            if(!queue.isEmpty()){
                if(Integer.parseInt(temp) > 0){
                    for(int j=0; j<Integer.parseInt(temp); j++){
                        queue.add(queue.poll());
                    }
                }else{
                    for(int j=0; j>Integer.parseInt(temp); j--){
                        System.out.println("Before");
                        System.out.println(queue.toString());
                        System.out.println("Before");
                        queue.addFirst(queue.pollLast());
                        System.out.println("After");
                        System.out.println(queue.toString());
                        System.out.println("After");
                    }
                }
            }
            System.out.println(i+"번째");
            System.out.println(queue.toString());
            System.out.println("!!!!!!!!!!!!!!!!!");
        }
        System.out.println(map.toString());
        for (int i=0; i<cnt; i++){
            bw.write(String.valueOf(resultList[i]));
            if(i!=cnt){
                bw.write(" ");
            };
        }
        bw.close();
    }
}

/*
3 2 1 -3 -1   //  3 빠지고 -1 2 1 -3
-1 2 1 -3     // -1 빠지고 -3 2 1
-3 2 1        // -3 빠지고 2 1
1 2           // 1 빠지고 1
2             // 2
*/