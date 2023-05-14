class Solution {
    public int compareVersion(String version1, String version2) {
        //first we have to convert the . part into the array 
        //means by using split method 1.01.244 is converted into array as 1,0,1,2,4,4
        //dot is a special character so we used one backslash and backslash is also a special           character so we used to 2 backslash
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int maxLength=Math.max(s1.length,s2.length);
        for(int i=0;i<maxLength;i++){
            //convert the string into integer using Integer.parseInt() method
            int v1=i<s1.length?Integer.parseInt(s1[i]):0;
            int v2=i<s2.length?Integer.parseInt(s2[i]):0;
            if(v1>v2)return 1;
            else if (v1<v2)return -1;
        }
        return 0;
    }
}