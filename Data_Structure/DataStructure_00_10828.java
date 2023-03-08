package DataStructure;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure_00_10828 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        Stack stack = new Stack();
        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            try{
                if(order.startsWith("push")){
                    stack.push(Integer.parseInt(st.nextToken()));
                }else if(order.equals("pop")){
                    bw.write(stack.pop()+"\n");
                }else if(order.equals("size")){
                    bw.write(stack.size()+"\n");
                }else if(order.equals("empty")){
                    if(stack.empty()){
                        bw.write(1+"\n");
                    }else{
                        bw.write(0+"\n");
                    }
                }else if(order.equals("top")){
                    bw.write(stack.peek()+"\n");
                }
            }catch (EmptyStackException e){
                bw.write(-1+"\n");
            }
        }
        bw.close();
    }
}
