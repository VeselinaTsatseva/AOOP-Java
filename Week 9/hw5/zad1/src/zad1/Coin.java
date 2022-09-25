package zad1;

import java.util.Random;

public class Coin {
    Random rand;
    Face face;

    public Coin(Face face) {
        setFace(face);
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public void flip(){

    }

    public boolean isHeads(){
        return face == Face.HEAD;
    }

    @Override
    public String toString() {
        return "Coin{" + " face = " + face + "}";
    }
}
