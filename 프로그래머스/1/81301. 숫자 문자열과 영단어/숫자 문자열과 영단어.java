import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> st = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>=48 && s.charAt(i)<=57) st.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            else {
                switch (s.charAt(i)) {
                    case 'z' :
                        st.add(0);
                        i+=3;
                        break;
                    case 'o' :
                        st.add(1);
                        i+=2;
                        break;
                    case 't' :
                        if(s.charAt(i+1) == 'w') {
                            st.add(2);
                            i+=2;
                        } else {
                            st.add(3);
                            i+=4;
                        }
                        break;
                    case 'f' :
                        if(s.charAt(i+1) == 'o') {
                            st.add(4);
                            i+=3;
                        } else {
                            st.add(5);
                            i+=3;
                        }
                        break;
                    case 's' :
                        if(s.charAt(i+1) == 'i') {
                            st.add(6);
                            i+=2;
                        } else {
                            st.add(7);
                            i+=4;
                        }
                        break;
                    case 'e' :
                        st.add(8);
                        i+=4;
                        break;
                    case 'n' :
                        st.add(9);
                        i+=3;
                        break;
                }
                
            }
        }

        int q = 1;
        for(int j=st.size()-1; j>=0; j--) {
            answer = answer + st.get(j) * q;
            q*=10;

        }
        return answer;
    }
}