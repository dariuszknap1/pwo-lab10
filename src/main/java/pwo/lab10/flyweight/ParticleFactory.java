package pwo.lab10.flyweight;

import java.util.List;
import java.util.ArrayList;

public class ParticleFactory {

    private final List<State> states = new ArrayList();

    Particle createParticle(double x, double y,
            String color, String texture) {
        State state = null;
        for (State s : states) {
            if (s.color.equals(color) && s.texture.equals(texture)) {
                state = s;
                break;
            }
        }
        if (state == null) {
            state = new State(color, texture);
            states.add(state);
        }
        return new Particle(new Context(x, y), state);
    }

    int getNumberOfStates() {
        return states.size();
    }
}
