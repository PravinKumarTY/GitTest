package com.string;

public class DeleteRepetedChar {
	public static String deleteRepeted(String str)
	{
		String str1="";
		char ch[]=str.toCharArray();
		int len=ch.length;
		for (int i = 0; i <len; i++) {
			for (int j = i+1; j <len; j++) {
				if(ch[i]==ch[j])
				{
					int k=j;
					while(k<len-1)
					{
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					len--;
					//str1=str1+ch[j];
				}
				//str1=str1+ch[j];
			}
			str1=str1+ch[i];
		}
		/*for (int i = 0; i < len; i++) {
			str1=str1+ch[i];
		}*/
		return str1;
	}
	public static void main(String[] args) {
        String s1="aabbbceaa";
        String s2=deleteRepeted(s1);
        System.out.println(s2);
	}

}
