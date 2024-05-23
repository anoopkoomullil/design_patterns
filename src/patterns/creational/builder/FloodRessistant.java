package patterns.creational.builder;

public class FloodRessistant implements Builder{

    private Home floodRessistant = new Home();
    @Override
    public void buildFloor() {
        this.floodRessistant.setTerrace("Flood Resistant Floor");
    }

    @Override
    public void buildWalls() {
        this.floodRessistant.setWall("Flood Resistant Walls");
    }

    @Override
    public void buildTerrace() {
        this.floodRessistant.setFloor("Flood Resistant Terrace");
    }

    @Override
    public Home getComplexHome() {
        return this.floodRessistant;
    }
}
