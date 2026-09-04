import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class BasicSTFLOfQueues
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q+" "+q.peek());
        q.remove();
        System.out.println(q+ " "+q.size());
        System.out.println(q.remove()+" "+q);
    }
}