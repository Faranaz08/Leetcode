class Solution {
    public String decodeString(String s) {
       	Stack<Integer> st=new Stack<>();
		Stack<String> sr=new Stack<>();
		int ptr=0;
		String ans="";
		while(ptr<s.length()) {
			char c=s.charAt(ptr);
			if(Character.isDigit(c)) {
				int num=0;
				while(Character.isDigit(s.charAt(ptr))) {
					num=num*10+s.charAt(ptr)-'0';
					ptr++;
				}
				st.push(num);
			}else if(c=='[') {
				sr.push(ans);
				ptr++;
				ans="";
			}else if(c==']') {
				StringBuilder sb=new StringBuilder(sr.pop());
				int count=st.pop();
				for(int i=0;i<count;i++) {
					sb.append(ans);
				}
				ans=sb.toString();
				ptr++;
			}else {
				ans+=c;
				ptr++;
			}
		}
		return ans;
        
    }
}