package DataStructure;

import java.io.*;
import java.util.Stack;

//못풀겠음
public class DataStructure_06_1935_ {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        double[] arr = new double[num];
        for(int i = 0; i < arr.length; i++) {
            //차례대로 하나씩 대입
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;
        for(int i = 0; i < data.length(); i++) {
            //알파벳일 경우
            if('A' <= data.charAt(i) && data.charAt(i) <= 'Z') {
                // A-A = 0 , B-A =1 ...... 를 이용해 A,B,C... 각 인덱스 구함 (arr[data.charAt(i) - 'A'])
                stack.push(arr[data.charAt(i) - 'A']);
            } else {
                if(!stack.isEmpty()) {
                    double first = stack.pop();
                    double second = stack.pop();
                    switch (data.charAt(i)) {
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }

}
