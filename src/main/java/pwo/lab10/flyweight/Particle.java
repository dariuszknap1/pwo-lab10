package pwo.lab10.flyweight;

public class Particle {

    private Context context;
    private State state;

    public Particle(Context context, State state) {
        this.context = context;
        this.state = state;
    }

    public void setX(double x) {
        context.setX(x);
    }

    public void setY(double y) {
        context.setY(y);
    }

    public double getX() {
        return context.getX();
    }

    public double getY() {
        return context.getY();
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ") "
                + state.color + " " + state.texture;
    }
}
