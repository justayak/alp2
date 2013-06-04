package a7.aufgabe2;

/**
 * @author  Prof. Dr. Margarita Esponda  
 * @version 0.1
 */
import java.util.Random;

public class Walker {

    public enum Direction {NORTH, EAST, WEST, SOUTH};

    int spaceSize;
    boolean[][] ws;
    int x, y;

    Random rand = new Random();

    public Walker(int size){
        spaceSize = size;
        ws = new boolean[spaceSize][spaceSize];
    }

    public Walker(){
        this(20);
    }

    public void clean_space(){
        for(int i=0; i<ws.length; i++)
            for(int j=0; j<ws.length; j++)
                ws[i][j] = false;
    }

    public boolean can_move(){
        return ((x>0) && !ws[x-1][y]) ||
                ((x<ws.length-1) && !ws[x+1][y]) ||
                ((y>0) && !ws[x][y-1]) ||
                ((y<ws.length-1) && !ws[x][y+1]);
    }

    public void try_step(){
        if (can_move()){
            int d = rand.nextInt(4);
            switch (Direction.values()[d]){
                case NORTH: if (y>0 && !ws[x][y-1])
                    ws[x][--y]=true; break;
                case EAST: if (x<ws.length-1 && !ws[x+1][y])
                    ws[++x][y]=true; break;
                case SOUTH: if (y<ws.length-1 && !ws[x][y+1])
                    ws[x][++y]=true; break;
                case WEST: if (x>0 && !ws[x-1][y])
                    ws[--x][y]=true;
            }
        }
    }

    public void init_walk(){
        x = rand.nextInt(ws.length);
        y = rand.nextInt(ws.length);
    }

}// end of class Walker
