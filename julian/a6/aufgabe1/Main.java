package a6.aufgabe1;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 27.05.13
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[]args){

        Matrix m = new Matrix(30,30);

        m.randomize();

        System.out.println(m);


    }

    private static void find(Matrix matrix){

        Matrix temp = new Matrix(matrix.height, matrix.width);

        for (int y=0; y<temp.height;y++){
            for (int x=0;x<temp.width;x++){

                if (matrix.is1(x,y) && !temp.is1(x,y)){

                    temp.set(x,y,1);
                    int currentX = x-1;
                    int currentY = y-1;
                    while( matrix.get(currentX,currentY) == 1 ){
                        currentX = currentX -1;
                        currentY = currentY -1;
                    }



                }

            }
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
            while (random.nextInt(1000)>1){
                int pos = random.nextInt(this.data.length);
                this.data[pos] = 1;
            }
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
            return this.data[pos] == 1;
        }

        public void set(int x, int y, int value){
            if (x >= 0 && y >= 0){
                int pos = (y*this.width) + x;
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
                    //builder.append(x > 9 ? "\t" : "\t\t");
                }
                builder.append("\n");
            }

            return builder.toString();
        }
    }

}
