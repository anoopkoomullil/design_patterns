package patterns.creational.builder;

public interface Builder {
    public void buildFloor();
    public void buildWalls();
    public void buildTerrace();
    public Home getComplexHome();
}
