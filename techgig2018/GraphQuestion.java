package techgig2018;

import java.util.*;


class ValueComparator implements Comparator<Integer> {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public ValueComparator(HashMap<Integer, Integer> map) {
        this.map.putAll(map);
    }

    @Override
    public int compare(Integer s1, Integer s2) {
        if (map.get(s1) >= map.get(s2)) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class GraphQuestion {

    private int v;
    private ArrayList<Integer>[] adjMat;
    HashMap<Integer, Integer> map;

    public GraphQuestion(int vertices) {
        this.v = vertices;
        initAdjList();
    }

    @SuppressWarnings("unchecked")
    private void initAdjList() {
        adjMat = new ArrayList[v];
        map = new HashMap<Integer, Integer>();
        for (int i = 0; i < v; i++) {
            adjMat[i] = new ArrayList<>();
            map.put(i, 0);
        }
    }

    public void addEdge(int u, int v) {
        adjMat[u].add(v);
        adjMat[v].add(u);
    }

    public void tracePaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();

        pathList.add(s);
        tracePathsPart(s, d, isVisited, pathList);
    }

    private void tracePathsPart(Integer u, Integer d,
                                boolean[] isVis,
                                List<Integer> localPath) {
        isVis[u] = true;

        if (u.equals(d)) {
            increaseCount(localPath);
        }

        for (Integer i : adjMat[u]) {
            if (!isVis[i]) {
                localPath.add(i);
                tracePathsPart(i, d, isVis, localPath);
                localPath.remove(i);
            }
        }
        isVis[u] = false;
    }

    private void increaseCount(List<Integer> localPathList) {
        for (int temp : localPathList) {
            map.put(temp, map.get(temp) + 1);
        }
    }

    public static TreeMap<Integer, Integer> sortMapByValue(HashMap<Integer, Integer> map) {
        Comparator<Integer> comparator = new ValueComparator(map);
        TreeMap<Integer, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        GraphQuestion g = new GraphQuestion(n);
        for (int i = 0; i < n - 1; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            g.addEdge(a - 1, b - 1);
        }
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            g.tracePaths(a - 1, b - 1);
        }
        TreeMap<Integer, Integer> sortedMap = sortMapByValue(g.map);
        System.out.println(sortedMap.firstEntry().getValue());
    }
}
