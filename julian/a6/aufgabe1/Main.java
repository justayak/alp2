package a6.aufgabe1;

import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 27.05.13
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[]args) throws IOException {

        Matrix m = new Matrix(30,30);
        m.randomize();

        System.out.println(m);

        Result[] result = find(m);


        System.out.println(result.length);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

        System.in.read();
    }

    private static Result[] find(Matrix matrix){

        Matrix temp = new Matrix(matrix.height, matrix.width);
        List<Result> results = new ArrayList<Result>();

        for (int y=0; y<temp.height;y++){
            for (int x=0;x<temp.width;x++){

                if (matrix.is1(x,y) && !temp.is1(x,y)){

                    temp.set(x,y,1);
                    int currentX = x+1;
                    int currentY = y+1;
                    boolean subtract1 = false;
                    while( matrix.get(currentX,currentY) == 1 ){
                        subtract1 = true;
                        temp.set(currentX,currentY,1);
                        currentX = currentX + 1;
                        currentY = currentY + 1;
                    }

                    int sideLength = subtract1 ? currentX - x: currentX - x;

                    if (matrix.is1Quad(x,y,sideLength, sideLength)){
                        temp.set1Quad(x,y,sideLength, sideLength);
                        results.add(new Result(x,y,sideLength));
                    }
                }

            }
        }

        Collections.sort(results);
        return results.toArray(new Result[0]);
    }

    private static class Result implements Comparable<Result> {
        public final int X;
        public final int Y;
        public final int SideLength;
        public Result(int x, int y, int sideLength){
            this.X = x;
            this.Y = y;
            this.SideLength = sideLength;
        }

        @Override
        public String toString(){
            return "{" + this.X + "," + this.Y + ", sl:" + this.SideLength + "}";
        }

        @Override
        public int compareTo(Result o) {
            return Integer.compare(this.SideLength, o.SideLength);
        }
    }

    private static class Matrix{

        private final int[] data;
        public final int width;
        public final int height;

        public Matrix(int height, int width){
            this.height=height;
            this.width = width;
            this.data = new int[height*width];
        }

        public void randomize(){
            Random random = new Random();
            while (random.nextInt(6500)>1){
                int pos = random.nextInt(this.data.length);
                this.data[pos] = 1;
            }
        }

        public void set1Quad(int x, int y, int width,int height){
            for (int mx = x; mx < x+width; mx++){
                for (int my = y; my < y+height; my++){
                    this.set(mx,my,1);
                }
            }
        }

        public boolean is1Quad(int x,int y,int width,int height){
            for (int mx = x; mx < x+width; mx++){
                for (int my = y; my < y+height; my++){
                    if (!this.is1(mx, my)){
                        return false;
                    }
                }
            }
            return true;
        }

        public int get(int x, int y){
            if (x < 0 || y < 0){
                return 0;
            } else if (x >= this.width || y >= this.height){
                return 0;
            }else{
                int pos = (y*this.width) + x;
                return this.data[pos];
            }
        }

        public boolean is1(int x, int y){
            int pos = (y*this.width) + x;
            if (pos >= this.data.length) return false;
            return this.data[pos] == 1;
        }

        public void set(int x, int y, int value){
            int pos = (y*this.width) + x;
            if(pos < this.data.length){
                this.data[pos] = value;
            }
        }

        @Override
        public String toString(){
            StringBuilder builder = new StringBuilder();
            for(int y=-1; y< this.height;y++){
                for (int x = -1; x<this.width;x++){
                    if (y== -1 && x==-1){
                        builder.append(" X ");
                    }else if(y == -1){
                        builder.append(x);
                    }else if (x==-1){
                        builder.append(y);
                        builder.append("|");
                    }else{
                        int pos = (y*this.width) + x;
                        builder.append( this.data[pos]);
                    }
                    builder.append  ("\t");
                }
                builder.append("\n");
            }

            return builder.toString();
        }
    }

}
