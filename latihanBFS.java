package codelab;
import java.util.*;

public class latihanBFS {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    latihanBFS(int v)
    {
        node = v;
        adj = new LinkedList[node];

        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    
    void insertEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int n){
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while(!que.isEmpty()){
            n = que.poll();
            System.out.print(n+" ");
            for(int i =0; i< adj[n].size(); i++){
                a = adj[n].get(i);
                if(!nodes[a]){
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String args[]){
        latihanBFS graph = new latihanBFS(6);
        graph.insertEdge(3, 2);
        graph.insertEdge(2, 4);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 5);
        graph.insertEdge(1, 5);
        graph.insertEdge(4, 0);
        graph.insertEdge(5, 0);
        graph.insertEdge(1, 0);
        System.out.println("traversal : ");
        graph.BFS(3);
    }
}
