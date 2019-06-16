public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        solution q1 = new solution(4.5,6.0,2.0);
        solution q2 = new solution(4.5,6.0,3.0);
        solution q3 = new solution(4.5,7.0,2.0);
        System.out.println(q1.quadraticSolution());
        System.out.println(q2.quadraticSolution());
        System.out.println(q3.quadraticSolution());

    }
}
