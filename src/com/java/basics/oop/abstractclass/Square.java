package com.java.basics.oop.abstractclass;

public class Square extends Figure {
    
    private int edgeLength;
    
    public Square(String name, int edgeLength) {
        super(name);
        this.edgeLength = edgeLength;
    }
    
    public int getEdgeLength() {
        return edgeLength;
    }
    
    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    @Override
    public void calculateArea() {
        
        System.out.println(getEdgeLength() * getEdgeLength());
        
    }
}
