package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<PriorityQueue<Integer>> graph;
	static int[] visited;
	static Queue<Integer> q = new ArrayDeque<>();
	static int order;

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int nodes = Integer.parseInt(st.nextToken());
			int lines = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());

			graph = new ArrayList<>();
			for (int i = 0; i < nodes + 1; i++) {
				graph.add(new PriorityQueue<>());
			}

			for (int i = 0; i < lines; i++) {
				st = new StringTokenizer(br.readLine());
				int node1 = Integer.parseInt(st.nextToken());
				int node2 = Integer.parseInt(st.nextToken());
				graph.get(node1).add(node2);
				graph.get(node2).add(node1);
			}

			visited = new int[nodes + 1];
			bfs(start);

			for (int i = 1; i < visited.length; i++) {
				bw.write(visited[i] + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void bfs(int visitNode) {
		order = 1;
		visited[visitNode] = order++;
		q.offer(visitNode);
		while (!q.isEmpty()) {
			int node = q.poll();
			for (int i = 0; i < graph.size() && !graph.get(node).isEmpty(); i++) {
				int adj = graph.get(node).poll();
				if (visited[adj] == 0) {
					visited[adj] = order++;
					q.offer(adj);
				}
			}
		}
	}
}