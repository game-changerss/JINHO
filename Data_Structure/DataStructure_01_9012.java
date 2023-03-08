package DataStructure;

import java.io.*;

public class DataStructure_01_9012 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i<cnt; i++){
            String command = br.readLine();
            while (true){
                if(!command.equals(command.replace("()",""))){
                    command=command.replace("()","");
                }else{
                    if(command.length()>0){
                        bw.write("NO\n");
                        break;
                    }
                    else{
                        bw.write("YES\n");
                        break;
                    }
                }
            }
        }
        bw.close();
    }

}
