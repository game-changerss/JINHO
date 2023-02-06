import java.io.*;
import java.util.*;

public class BaekJoon_1620 {
    public void num03() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int totalCnt = Integer.parseInt(st.nextToken());
//        int questionCnt = Integer.parseInt(st.nextToken());
//
//        List<String> list;
//        String[] list_ = new String[totalCnt];
//        for(int i=0; i<totalCnt; i++){
//            list_[i]= br.readLine();
//        }
//        list = Arrays.asList(list_);
//
//        for(int i=0; i<questionCnt; i++){
//            String temp = br.readLine();
//            try {
//                int idx = Integer.parseInt(temp);
//                bw.write(list.get(idx-1)+"\n");
//            }catch (Exception e){
//                bw.write((list.indexOf(temp)+1)+"\n");
//            }
//        }
//        bw.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalCnt = Integer.parseInt(st.nextToken());
        int questionCnt = Integer.parseInt(st.nextToken());

        Map<Integer, String> ismap = new HashMap<>();
        Map<String, Integer> simap = new HashMap<>();
        for(int i=0; i<totalCnt; i++){
            String collection = br.readLine();
            ismap.put(i, collection);
            simap.put(collection, i);
        }

        for(int i=0; i<questionCnt; i++){
            String temp = br.readLine();
            try {
                int idx = Integer.parseInt(temp);
                bw.write(ismap.get(idx-1)+"\n");
            }catch (NumberFormatException nfe){
                bw.write((simap.get(temp)+1)+"\n");
            }
        }
        bw.close();
    }
}
