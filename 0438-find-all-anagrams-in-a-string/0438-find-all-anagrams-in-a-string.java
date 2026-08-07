class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.length() > s.length()) return list;
        int[] need = new int[26];
        int[] window = new int[26];
        for(char ch : p.toCharArray()){
            need[ch - 'a']++;
        }
        int k = p.length();
        for(int i=0;i<k;i++){
            window[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(need,window)){
            list.add(0);
        }
        for(int i=k;i<s.length();i++){
            window[s.charAt(i)-'a']++;
            window[s.charAt(i-k)-'a']--;
            if (Arrays.equals(need, window)) list.add(i - k + 1);
        }
        return list;
    }
}