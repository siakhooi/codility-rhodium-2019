package nsh.codility;

import java.util.Arrays;

public class Rhodium2019B1 implements Rhodium2019Interface {
	public int solution(int[] T) {
		int N = T.length;
		int[][] connections = new int[N][N];
		int[] size = new int[N];
		for (int i = 0; i < N; i++) {
			if (T[i] == i)
				continue;
			connections[i][size[i]++] = T[i];
			connections[T[i]][size[T[i]]++] = i;
		}
		for (int i = 0; i < N; i++)
			Arrays.sort(connections[i], 0, size[i]);

		int answer = 0;
		for (int i = 0; i < N; i++) {
			int[] stack = new int[N];
			int stacksize = 0;
			boolean[] visited = new boolean[N];
			stack[stacksize++] = i;
			int n = i - 1;
			int nextPossibleNumber = -1;
			visited[i] = true;
			while (stacksize > 0) {
				n++;
				int currentNumber = stack[0];
				stack[0] = 10000; // disabled this number
				nextPossibleNumber = Math.max(nextPossibleNumber, currentNumber);
				if (nextPossibleNumber == n)
					answer++;
				for (int j = 0; j < size[currentNumber]; j++) {
					int x = connections[currentNumber][j];
					if (x < i)
						continue;
					if (visited[x])
						continue;
					visited[x] = true;
					stack[stacksize++] = x;
				}
				Arrays.sort(stack, 0, stacksize);
				stacksize--; // remove the disabled number
			}
		}
		return answer;
	}
}
