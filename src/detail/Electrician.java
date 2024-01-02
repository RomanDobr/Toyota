package detail;

public class Electrician {
    private boolean isFunctional;

    public Electrician(boolean isFunctional) {
        this.isFunctional = isFunctional;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }
}
