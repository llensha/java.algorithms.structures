package lesson7.homework7;

import lesson7.Graph;

public class CheckGraphSearch {
    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdges("Тула", "Липецк");
        graph.addEdges("Тамбов", "Рязань", "Саратов");
        graph.addEdges("Орел", "Калуга", "Курск");
        graph.addEdges("Воронеж", "Липецк", "Саратов", "Курск");

        graph.searchShortestPath("Москва", "Воронеж");
        graph.searchShortestPath("Тамбов", "Калуга");
        graph.searchShortestPath("Липецк", "Орел");

    }

}
