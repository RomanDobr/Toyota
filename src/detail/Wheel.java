package detail;

public class Wheel {
    private boolean isHole;
    private int Diameter;
    private boolean isUniversal;

    public Wheel(boolean isHole, int diameter, boolean isUniversal) {
        this.isHole = isHole;
        Diameter = diameter;
        this.isUniversal = isUniversal;
    }

    public boolean isHole() {
        return isHole;
    }

    public void setHole(boolean hole) {
        isHole = hole;
    }

    public int getDiameter() {
        return Diameter;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }

    public boolean isUniversal() {
        return isUniversal;
    }

    public void setUniversal(boolean universal) {
        isUniversal = universal;
    }

    public boolean doUniversal(int diameter1, int diameter2) {
        return isUniversal = true;
    }
}
