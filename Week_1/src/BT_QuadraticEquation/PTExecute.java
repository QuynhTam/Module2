package BT_QuadraticEquation;

public class PTExecute {
    public static void main(String[] args) {
        PhuongTrinhBacHai ptb2 = new PhuongTrinhBacHai();
        ptb2.setA(-1);
        ptb2.setB(-2);
        ptb2.setC(3);
        System.out.println(ptb2.getDiscriminant());
        System.out.println(ptb2.getRoot());
    }
}
