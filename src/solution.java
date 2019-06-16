public class solution {
    private Double a;
    private Double b;
    private Double c;

    public solution(){
    }

    public solution(Double a, Double b, Double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    result quadraticSolution() {
        Double x1;
        Double x2;
        result res = new result(null, null);
        double D;
        System.out.println(this.a + "*" + "x+" + this.b + "*" + "x+" + this.c + "=" + "y");
        D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Уравнение не имеет решения");

        } else if (D == 0) {
            System.out.println("Уравнение имеет один корень");
            x1 = (-1 * this.b) / (2 * a);
            res.setX1(x1);

        } else {
            System.out.println("Уравнение имеет два корня");
            x1 = (-1 * this.b - Math.sqrt(D)) / (2 * a);
            x2 = (-1 * this.b + Math.sqrt(D)) / (2 * a);
            res.setX1(x1);
            res.setX2(x2);

        }
        System.out.println(res);
        return res;
    }

}
