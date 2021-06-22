
import java.util.LinkedList;
import java.util.Queue;

    public class Graph {
        private final Vertex[] vertexList;
        private final int[][] adjMat;
        private int size;
        private final Stack stack;

        public Graph() {
            int MAX_VERTS = 32;
            stack = new Stack(MAX_VERTS);
            vertexList = new Vertex[MAX_VERTS];
            adjMat = new int[MAX_VERTS][MAX_VERTS];
            size = 0;
            for (int i = 0; i < MAX_VERTS; i++) {
                for (int j = 0; j < MAX_VERTS; j++) {
                    adjMat[i][j] = 0;
                }
            }
        }

        public void addVertex(char label) {
            vertexList[size++] = new Vertex(label);
        }

        public void addEdge(int start, int end) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        }

        public void displayVertex(int vertex) {
            System.out.println(vertexList[vertex].label);
        }

    }
