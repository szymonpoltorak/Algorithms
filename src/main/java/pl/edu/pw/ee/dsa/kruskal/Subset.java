package pl.edu.pw.ee.dsa.kruskal;

public class Subset{
    private int level;
    private int parent;

    public Subset(){
        level = 0;
        parent = -1;
    }

    public int getLevel(){
        return level;
    }

    public int getParent(){
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public String toString(){
        return  "\nRank: " + level + " Parent: " + parent + "";
    }
}