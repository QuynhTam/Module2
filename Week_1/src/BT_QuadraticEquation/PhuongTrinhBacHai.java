package BT_QuadraticEquation;

public class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBacHai() {

    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public String getRoot() {
        if (this.getDiscriminant() < 0) {
            return "Phương trình vô nghiệm";
        } else if (this.getDiscriminant() == 0)
            return "phương trình có nghiệm kép X1=X2= " + (-this.b / (this.a * 2));
        else {
            return "Phương trình có 2 nghiệm phân biệt X1= " + ((-this.b + Math.sqrt(this.getDiscriminant())) / (this.a * 2))
                    + " , X2 = " + ((-this.b - Math.sqrt(this.getDiscriminant())) / (this.a * 2));
        }
    }
}
