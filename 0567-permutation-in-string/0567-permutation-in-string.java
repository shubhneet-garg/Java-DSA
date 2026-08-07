class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        for(char ch : s1.toCharArray()){
            need[ch-'a']++;
        }
        int k = s1.length();

        for(int i=0;i<k;i++){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(need,window)){
            return true;
        }
        for(int i=k;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(need,window)) return true;
        }
        return false;
    }
}