package patterns.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }
    public Home getComplexHome(){
        return this.builder.getComplexHome();
    }

    public void buildComplexHome(){
        this.builder.buildWalls();
        this.builder.buildFloor();
        this.builder.buildTerrace();
    }
}
