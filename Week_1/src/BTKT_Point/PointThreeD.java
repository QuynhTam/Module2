package BTKT_Point;

public class PointThreeD extends PointTwoD {
    private float z = 0f;

    public PointThreeD() {
    }

    public PointThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] XYZ = {super.getX(), super.getY(), this.getZ()};
        return XYZ;
    }

    @Override
    public String toString() {
        return "PointThreeD " + super.toString() + "z= " + z + " PointThreeD is subclass of PointTwoD";
    }
}
