package nsh.codility;

import java.util.Arrays;

public class Rhodium2019B4 implements Rhodium2019Interface {
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
		int[] stack = new int[N];
		int[] newstack = new int[N];
		int[] working = new int[N];
		for (int i = 0; i < N; i++) {
			int stackstart = 0;
			int stackstop = 0;
			boolean[] visited = new boolean[N];
			stack[stackstop++] = i;
			int n = i - 1;
			int nextPossibleNumber = -1;
			visited[i] = true;
			while (stackstop > stackstart) {
				n++;
				int currentNumber = stack[stackstart++];
				nextPossibleNumber = Math.max(nextPossibleNumber, currentNumber);
				if (nextPossibleNumber == n)
					answer++;
				if (size[currentNumber] == 0)
					continue;
				if (stackstop == stackstart) {
					for (int j = 0; j < size[currentNumber]; j++) {
						int x = connections[currentNumber][j];
						if (x < i)
							continue;
						if (visited[x])
							continue;
						visited[x] = true;
						stack[stackstop++] = x;
					}
				} else {
					int w = 0;
					for (int j = 0; j < size[currentNumber]; j++) {
						int x = connections[currentNumber][j];
						if (x < i)
							continue;
						if (visited[x])
							continue;
						visited[x] = true;
						working[w++] = x;
					}
					mergeSortedArrays(stack, working, newstack, stackstart, stackstop, w);
					int[] zz = stack;
					stack = newstack;
					newstack = zz;
					stackstop = stackstop - stackstart + w;
					stackstart = 0;
				}
			}
		}
		return answer;
	}

	void mergeSortedArrays(int[] stack1, int[] stack2, int[] newstack, int stackstart, int stackstop, int w) {
		int i1 = stackstart, i2 = 0;
		int i3 = 0;
		while (i1 < stackstop && i2 < w)
			if (stack1[i1] < stack2[i2])
				newstack[i3++] = stack1[i1++];
			else if (stack1[i1] > stack2[i2])
				newstack[i3++] = stack2[i2++];

		while (i1 < stackstop)
			newstack[i3++] = stack1[i1++];
		while (i2 < w)
			newstack[i3++] = stack2[i2++];
	}
}
