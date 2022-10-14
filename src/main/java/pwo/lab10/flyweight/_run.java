package pwo.lab10.flyweight;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class _run {

    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"};
        String[] textures = {"flat", "arised"};
        Random rnd = new Random();
        List<Particle> particles = new ArrayList<>();
        ParticleFactory factory = new ParticleFactory();
        for (int i = 0; i < 1000; i++) {
            double x = rnd.nextDouble();
            double y = rnd.nextDouble();
            String color = colors[rnd.nextInt(colors.length)];
            String texture = textures[rnd.nextInt(textures.length)];
            Particle p = factory.createParticle(x, y, color,
                    texture);
            particles.add(p);
        }
        particles.forEach(p -> System.out.println(p.toString()));
        System.out.println();
        System.out.println("Liczba cząstek: " + particles.size());
        System.out.println("Liczba stanów: "
                + factory.getNumberOfStates());
    }
}
