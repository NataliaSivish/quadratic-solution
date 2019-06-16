public class result {

    private Double x1;
    private Double x2;

    public result(){
    }

    public result(Double x1){
        this.x1=x1;
    }

    public result(Double x1, Double x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "result{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }

}
