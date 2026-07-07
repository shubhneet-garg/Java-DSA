package Stacks;
import java.util.*;
public class BasicSTLofStacks {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Khushi");
        st.push("preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");
        System.out.println(st+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}
