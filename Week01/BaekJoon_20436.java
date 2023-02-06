import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String start = br.readLine();
        String goal = br.readLine();

        String[][] asd = {{"q","w","e","r","t","y","u","i","o","p"},
                {"a","s","d","f","g","h","j","k","l"},
                {"z","x","c","v","b","n","m"}};

        String[] aa = {"q","w","e","r","t","a","s","d","f","g","z","x","c","v"};
        List<String> list = Arrays.asList(aa);

        Map<String, int[]> map = new HashMap<>();
        for(int i=0; i<asd.length; i++){
            for(int j=0; j<asd[i].length; j++){
                int[] temp = {i,j};
                map.put(asd[i][j], temp);
            }
        }

        int[][] now = {map.get(start.split(" ")[0]),map.get(start.split(" ")[1])};

        for(int i=0; i<goal.length(); i++){
            if(list.indexOf(String.valueOf(goal.charAt(i))) != -1){
                int[] a = now[0];
                int[] b = map.get(String.valueOf(goal.charAt(i)));

                int x = Math.abs(a[0] - b[0]);
                int y = Math.abs(a[1] - b[1]);

                now[0] = b;
                result+=(x+y);

            }else{
                int[] a = now[1];
                int[] b = map.get(String.valueOf(goal.charAt(i)));

                int x = Math.abs(a[0] - b[0]);
                int y = Math.abs(a[1] - b[1]);

                now[1] = b;
                result+=(x+y);
            }
            result+=1;
        }
        bw.write(result+"\n");
    }
}
