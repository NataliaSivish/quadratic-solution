public class solution {
    private Double a;
    private Double b;
    private Double c;
    private Boolean ischange;
    private result res;

    public solution() {
    }

    public solution(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ischange = true;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
        ischange = !this.a.equals(a);
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
        ischange = !this.a.equals(b);
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
        ischange = !this.a.equals(c);
    }

    void quadraticSolution() {
        Double x1;
        Double x2;
        double D;
        System.out.println(this.a + "*" + "x+" + this.b + "*" + "x+" + this.c + "=" + "y");
        D = b * b - 4 * a * c;
        if (D < 0) {
            res = new result();
        } else if (D == 0) {
            x1 = (-1 * this.b) / (2 * a);
            res = new result(x1);
        } else {
            x1 = (-1 * this.b - Math.sqrt(D)) / (2 * a);
            x2 = (-1 * this.b + Math.sqrt(D)) / (2 * a);
            res = new result(x1, x2);
        }
    }

    void printResult() {
        if (ischange) {
            quadraticSolution();
            ischange = false;
            System.out.println("sdrgreh");
        }
        if (res.getX1() == null) {
            System.out.println("Уравнение не имеет решения");
        } else if (res.getX2() == null) {
            System.out.println("Уравнение имеет один корень");
            System.out.println(" x1 = " + res.getX1());
        } else {
            System.out.println("Уравнение имеет два корня");
            System.out.println("x1 = " + res.getX1() + " x2 = " + res.getX2());
        }

    }

}
