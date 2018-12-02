package sample;

import javafx.geometry.Point2D;

import java.util.List;

public class Shape {
    Point2D position;
    List<Block> blocks;
    boolean isLocked;

    public Shape(){
        //position = onTop;
        randomNextShape();
    }

    enum shape{
        L,I,S,T,N
    }

    public void spawn(){

    }

    public shape randomNextShape(){
        return shape.L;
    }

    public void move(){

    }

    //TODO ändra beroende på hur JAVAFX funkar.
    public void paint(){

    }

}
