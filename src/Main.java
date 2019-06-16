public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        solution q1 = new solution(4.5,6.0,2.0);
        solution q2 = new solution(4.5,6.0,3.0);
        solution q3 = new solution(4.5,7.0,2.0);
        q1.printResult();
        q1.setA(6.7);
        q1.printResult();
        q1.printResult();
//        q2.printResult();
//        q3.printResult();
    }
}
