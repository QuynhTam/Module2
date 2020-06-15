package BTKT_Point;

public class PointTwoD {
    private float x = 0f;
    private float y = 0f;

    public PointTwoD() {
    }

    public PointTwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] XY = new float[2];
        XY[0] = this.getX();
        XY[1] = this.getY();
        return XY;
    }

    @Override
    public String toString() {
        return "PointTwoD " +
                "x= " + x +
                ", y= " + y;
    }
}
