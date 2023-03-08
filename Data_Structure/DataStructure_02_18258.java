package DataStructure;

import java.io.*;
import java.util.*;

public class DataStructure_02_18258 {
    public void main() throws IOException {
        Deque<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch(order){
                case "push" :
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(queue.poll()+"\n");
                    }
                    break;
                case "size" :
                    bw.write(queue.size()+"\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()){
                        bw.write(1+"\n");
                    }else{
                        bw.write(0+"\n");
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(queue.peek()+"\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(queue.peekLast()+"\n");
                    }
                    break;
            }

        }
        bw.close();
    }
}
