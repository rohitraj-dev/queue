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
        System.out.print("enter k : ");
        int k = sc.nextInt();
        display(q);
        reverseQueue(q,k);
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
    public static Queue<Integer> reverseQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> st = new Stack<>();
        while(q.size()<=k)
        {
            st.push(q.remove());
        }
        while(st.size()>0)
        {
            q.add(st.pop());
        }
        for(int i=1; i<=q.size()-k; i++)
        {
            q.add(q.remove());
        }
        return q;
    }
}