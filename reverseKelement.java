import java.util.*;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k>q.size()|| k==0)return q ;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < k ; i++){
            st.push(q.remove());
        }
        Queue<Integer> q1 = new LinkedList<>();
        while(q.size()!=0){
            q1.add(q.remove());
        }
          for(int i = 0 ; i < k ; i++){
            q.add(st.pop());
        }
        while(q1.size()!=0){
            q.add(q1.remove());
        }
        
        return q ;
    }
}
public class reverseKelement{
    public static void main(String args[]){

    }
}