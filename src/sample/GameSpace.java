package sample;

public class GameSpace {

    //In terms of blocks.
    int width;
    int height;

    //Game Area som håller i alla blocks.
    Block[][] gameArea = new Block[0][0];


    //To know when the game is lost.
    public boolean isOutOfBounds(){
        return true;
    }



    public boolean hasFullRow(){
        return true;
    }
}
