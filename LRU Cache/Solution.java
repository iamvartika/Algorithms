import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;
public class Solution {


	static Deque<Integer> dq;


	static HashSet<Integer> map;


	static int csize;

	Solution(int n)
	{
		dq = new LinkedList<>();
		map = new HashSet<>();
		csize = n;
	}


	public void refer(int x)
	{
		if (!map.contains(x)) {
			if (dq.size() == csize) {
				int last = dq.removeLast();
				map.remove(last);
				
			}
		}
		else {

			int index = 0, i = 0;
			Iterator<Integer> itr = dq.iterator();
			while (itr.hasNext()) {
				if (itr.next() == x) {
					index = i;
					break;
				}
				i++;
			}
			dq.remove(index);
		}

dq.removeLas

		//This will run always
		dq.push(x);

	}


	public void display()
	{
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args)
	{
		Solution ca = new Solution(4);
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(1);
		ca.refer(4);
		ca.refer(5);
		ca.display();
	}
}

