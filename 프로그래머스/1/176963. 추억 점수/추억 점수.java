import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        
        for(int i = 0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        // System.out.println("map : " + map);
        for(int i = 0; i<photo.length; i++){
            int sum = 0;
            for(int j = 0; j<photo[i].length; j++){
                if(map.containsKey(photo[i][j])){
                    sum += map.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}