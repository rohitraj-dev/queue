import java.util.*;
class CircularGame
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

        findTheWinner(q, q.size(), q.size()-1);
        sc.close();

    }
    public static int findTheWinner(Queue<Integer> q,int n, int k)
    {
        for(int i=1; i<=n; i++)
        {
            q.add(i);
        }
        while(q.size()>1)
        {
            for(int i=1; i<=k-1; i++)
            {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}