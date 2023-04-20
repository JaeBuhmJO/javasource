package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int houses;

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());

			map = new int[n][n];
			visited = new boolean[n][n];

			for (int i = 0; i < n; i++) {
				String[] mapLine = br.readLine().split("");
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(mapLine[j]);
				}
			}

			ArrayList<Integer> cluster = new ArrayList<>();
			for (int i = 0; i < n; i++) { // y축
				for (int j = 0; j < n; j++) { // x축
					if (!visited[i][j] && map[i][j] == 1) {
						houses = 0;
						bfs(j, i);
						cluster.add(houses);
					}
				}
			}

			Collections.sort(cluster);
			bw.write(cluster.size() + "\n");
			for (Integer integer : cluster) {
				bw.write(integer + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		houses += 1;
		visited[y][x] = true;
		int[] coor = { x, y };
		queue.offer(coor);
		while (!queue.isEmpty()) {
			int[] node = queue.poll();
			int nodeX = node[0];
			int nodeY = node[1];
			if (nodeX >= 0 && nodeX < visited.length && nodeY - 1 >= 0 && nodeY - 1 < visited.length
					&& !visited[nodeY - 1][nodeX]) {
				visited[nodeY - 1][nodeX] = true;
				houses += 1;
				int[] coorNext = { nodeX, nodeY - 1 };
				queue.offer(coorNext);
			}
			if (nodeX - 1 >= 0 && nodeX - 1 < visited.length && nodeY >= 0 && nodeY < visited.length
					&& !visited[nodeY][nodeX - 1]) {
				visited[nodeY][nodeX - 1] = true;
				houses += 1;
				int[] coorNext = { nodeX - 1, nodeY };
				queue.offer(coorNext);
			}
			if (nodeX >= 0 && nodeX < visited.length && nodeY + 1 >= 0 && nodeY + 1 < visited.length
					&& !visited[nodeY + 1][nodeX]) {
				visited[nodeY + 1][nodeX] = true;
				houses += 1;
				int[] coorNext = { nodeX, nodeY + 1 };
				queue.offer(coorNext);
			}
			if (nodeX + 1 >= 0 && nodeX + 1 < visited.length && nodeY >= 0 && nodeY < visited.length
					&& !visited[nodeY][nodeX + 1]) {
				visited[nodeY][nodeX + 1] = true;
				houses += 1;
				int[] coorNext = { nodeX + 1, nodeY };
				queue.offer(coorNext);
			}
		}
	}
}