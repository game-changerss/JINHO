package org.example.dataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

//못풀겠음
public class DataStructure_06_1935__ {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String command = br.readLine();

        Deque<String> deque = new LinkedList<>();

        int idx = 0;
        String[] list = new String[cnt];

        for(int i=0; i<cnt; i++){
            list[i] = br.readLine();
        }

        for(int i=0; i<command.length(); i++){
            //65~90 A~Z 아스키코드값
            if (64 < command.charAt(i) && command.charAt(i)<91){
                deque.add(list[idx++]);
            }else{
                deque.add(String.valueOf(command.charAt(i)));
            }
        }

        while(deque.size() != 1){
            char poll = deque.poll().charAt(0);
            System.out.println(poll+"sdfsd");
            try{
                double a = Integer.parseInt(deque.pollLast());
                double b = Integer.parseInt(deque.pollLast());
                switch (poll){
                    case '+':
                        deque.add(String.valueOf(a+b));
                        break;
                    case '-':
                        deque.add(String.valueOf(a-b));
                        break;
                    case '*':
                        deque.add(String.valueOf(a*b));
                        break;
                    case '/':
                        deque.add(String.valueOf(a/b));
                        break;
                }
            }catch (NumberFormatException nfe){
                deque.add(String.valueOf(poll));
            }
        }

        System.out.println(deque.poll());
    }

}
