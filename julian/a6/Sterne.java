package a6;
public class Sterne {
    public static void main(String[] args) {
        int y = 0;
        while (y<40) {y = (int) (Math.random()*200);}
        for (int i = 0; i < y; i++) {
            double z = 1;
            while (z>0.2) {z = Math.random();}
            double t = Math.random()-0.05;
            double r = Math.random()-0.05;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(0.0*z+r, 0.5*z+t, 0.45*z+r, 0.55*z+t);
            StdDraw.line(0.45*z+r, 0.55*z+t, 0.5*z+r, 1.0*z+t);
            StdDraw.line(0.5*z+r, 1.0*z+t, 0.55*z+r, 0.55*z+t);
            StdDraw.line(0.55*z+r, 0.55*z+t, 1.0*z+r, 0.5*z+t);
            StdDraw.line(1.0*z+r, 0.5*z+t, 0.55*z+r, 0.45*z+t);
            StdDraw.line(0.55*z+r, 0.45*z+t, 0.5*z+r, 0.0*z+t);
            StdDraw.line(0.5*z+r, 0.0*z+t, 0.45*z+r, 0.45*z+t);
            StdDraw.line(0.45*z+r, 0.45*z+t, 0.0*z+r, 0.5*z+t);
        }
    }
}
