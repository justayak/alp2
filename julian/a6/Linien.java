package a6;

public class Linien {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i = i + 1) {
            float z = (float) i;
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(0.0, z/50, 1.0-(z/50), 0.0);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(1.0, z/50, 1.0-(z/50), 1);
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(z/50, 1-(z/50), 1.0, z/50);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(z/50, z/50, 1.0, 1-(z/50));
        }
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(0.0, 0.0, 0.0, 1.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(0.0, 1.0, 1.0, 1.0);
        
    }
}
