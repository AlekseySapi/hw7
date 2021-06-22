public class Main {

    public static void main(String[] args) {

//        Задание 7.1
/*
        Примеры: перевозка грузов по системе железных дорог или перекачка нефти по трубопроводам, либо управление запасами,
        либо старницы сайта - вершины, а гиперсылки - рёбра, связывающие вершины.
*/


//        Задание 7.2
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 2); //BC
        graph.addEdge(0, 3); //AD
        graph.addEdge(3, 4); //DE

        graph.displayVertex(4);
        graph.displayVertex(2);

        System.out.println();

        System.out.println("Реализацию метода обхода в глубину:");
        long nano_startTime = System.nanoTime();
        graph.dfs();
        long nano_endTime = System.nanoTime();
        System.out.println("Время, затраченное на обход в глубину: " + (nano_endTime - nano_startTime) + " нс");

        System.out.println();

        System.out.println("Реализацию метода обхода в ширину:");
        nano_startTime = System.nanoTime();
        graph.bfs();
        nano_endTime = System.nanoTime();
        System.out.println("Время, затраченное на обход в ширину: " + (nano_endTime - nano_startTime) + " нс");

    }

}
