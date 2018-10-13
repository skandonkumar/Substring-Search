public class Solution {
	public static int strStr(String haystack, String needle) {
		char[] hay = haystack.toCharArray();
		char[] need = needle.toCharArray();
		int j=0;
		if(need.length == 0)return 0;
		if(hay.length < need.length)return -1;
		for(int i=0; i<hay.length; i++) {
			int temp = i;
			if(hay.length - i < need.length)return -1;
			if(need[j] == hay[i]) {
				for(j=0;j<need.length;j++) {
					if(need[j] == hay[temp]) {
						temp ++;
					}
					else break;
				}
				if(need.length == (temp-i))return i;
				else j = 0;
			}
		}
		return -1;
        
    }
	public static void main(String args[]) {
		String haystack = "mississippi";
		String needle = "issipi";
		int index = strStr(haystack, needle);
		System.out.println(index);
	}
}
