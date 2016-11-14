package com.paranyak.flowers;

public enum FlowerColor {
    BLACK, RED, WHITE, PINK, GREEN, NOCOLOR;
    public String toString(){
        String a = "";
        switch (this){
            case GREEN: a = "Green color"; break;
            case BLACK: a = "Black color"; break;
            case RED: a = "Red color"; break;
            case WHITE: a = "White color"; break;
            case PINK: a = "Pink color"; break;

        }
        return a;
    }
}
