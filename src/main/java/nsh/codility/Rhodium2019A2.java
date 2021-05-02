package nsh.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Rhodium2019A2 implements Rhodium2019Interface {
	public int solution(int[] T) {
		int N = T.length;
		ArrayList<ArrayList<Integer>> connections = new ArrayList<ArrayList<Integer>>(N);
		for (int i = 0; i < N; i++)
			connections.add(new ArrayList<Integer>(N));
		for (int i = 0; i < N; i++) {
			if (T[i] == i)
				continue;
			connections.get(i).add(T[i]);
			connections.get(T[i]).add(i);
		}
		int answer = 0;
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> stack = new ArrayList<Integer>(N);
			boolean[] visited = new boolean[N];
			stack.add(i);
			int n = i - 1;
			int nextPossibleNumber = -1;
			visited[i] = true;
			while (!stack.isEmpty()) {
				n++;
				int currentNumber = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				nextPossibleNumber = Math.max(nextPossibleNumber, currentNumber);
				if (nextPossibleNumber == n)
					answer++;
				for (int x : connections.get(currentNumber)) {
					if (x < i)
						continue;
					if (visited[x])
						continue;
					visited[x] = true;
					stack.add(x);
				}
				stack.sort(Comparator.reverseOrder());
			}
		}
		return answer;
	}
}
