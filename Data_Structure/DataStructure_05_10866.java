package DataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DataStructure_05_10866 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push_front" :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    bw.write(deque.isEmpty()?"-1\n":deque.poll()+"\n");
                    break;
                case "pop_back" :
                    bw.write(deque.isEmpty()?"-1\n":deque.pollLast()+"\n");
                    break;
                case "size" :
                    bw.write(deque.size()+"\n");
                    break;
                case "empty" :
                    bw.write(deque.isEmpty()?"1\n":"0\n");
                    break;
                case "front" :
                    bw.write(deque.isEmpty()?"-1\n":deque.peek()+"\n");
                    break;
                case "back" :
                    bw.write(deque.isEmpty()?"-1\n":deque.peekLast()+"\n");
                    break;
            }
        }
        bw.close();
    }

}
