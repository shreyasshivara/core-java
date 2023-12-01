package com.work.shreyas.defaultmethod.thing;

public class Heart {
    public int beatRate;
    public int bp;
    public int weight;
    public Heart(int beatRate,int bp,int weight){
        this.beatRate=beatRate;
        this.bp=bp;
        this.weight=weight;
        System.out.println("created int,int,int arg const");
    }

    @Override
    public String toString() {
        return "Heart info: beatRate:"+ this.beatRate+"permin" +" bp:"+this.bp + " weight:"+this.weight+"gm";
    }
}
