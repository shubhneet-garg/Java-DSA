class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        generate(0, s, new ArrayList<>(), ans);
        return ans;
    }
    public void generate(int index, String s, List<String> curr, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(ispalindrome(s, index, i)){
                curr.add(s.substring(index, i+1));
                generate(i+1, s, curr, ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}