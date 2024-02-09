class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag=false;
        char[]tempArray=s.toCharArray();
        char[]tempArray1=t.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);

        String s1=String.valueOf(tempArray);
        String s2=String.valueOf(tempArray1);
        if(s1.equals(s2))
        {
            flag=true;
        }

        return flag;

    }
}