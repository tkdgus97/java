package programmers.lvone;

import java.util.*;

public class report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int length = id_list.length;
        int[] answer = new int[length];

//        Set<Map<String, String>> set = new HashSet<>();
        Map<Integer, Integer> idMap = new HashMap<>();
        Map<String, Set<String>> reportMap = new HashMap<>();

        System.out.println();
        int mapIdx =0;
        for (String id : id_list) {
            int init = 0;
            Set<String> set = new HashSet<>();
            idMap.put(mapIdx, init);
            reportMap.put(id, set);
            mapIdx+=1;
        }

        for (String s:report) {
            String[] splitReport = s.split(" ");
            if (Arrays.stream(id_list).anyMatch(name -> name.equals(splitReport[0]))
                    && Arrays.stream(id_list).anyMatch(name -> name.equals(splitReport[1]))) {
                reportMap.get(splitReport[1]).add(splitReport[0]);
            }
        };

        for (String id : id_list) {
            if (reportMap.get(id).size() >= k){
                for (String reporter : reportMap.get(id)) {
                    int idx = Arrays.asList(id_list).indexOf(reporter);
                    int count = idMap.get(idx);
                    count += 1;
                    idMap.replace(idx, count);
                }
            }
        }

        for (int i = 0; i < idMap.size(); i++){
            answer[i] = idMap.get(i);
        }

        return answer;
    }
}
