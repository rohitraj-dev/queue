import java.util.*;
class ReverseQueue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        reverseQueue(q);
        display(q);
    }
    public static void display(Queue<Integer> q)
    {
        int n = q.size();
        for(int i=0; i<n; i++)
        {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        Stack<Integer> st = new Stack<>();
        while(q.size()>0)
        {
            st.push(q.remove());
        }
        while(st.size()>0)
        {
            q.add(st.pop());
        }
        return q;
    }
}