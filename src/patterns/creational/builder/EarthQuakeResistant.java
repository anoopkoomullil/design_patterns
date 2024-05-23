package patterns.creational.builder;

public class EarthQuakeResistant implements Builder{
    private Home earthQuakeResistant = new Home();

    @Override
    public void buildFloor() {
        this.earthQuakeResistant.setFloor("Earth Quake Resistant Floor");
    }

    @Override
    public void buildWalls() {
        this.earthQuakeResistant.setWall("Earth Quake Resistant Wall");
    }

    @Override
    public void buildTerrace() {
        this.earthQuakeResistant.setTerrace("Earth Quake Resistant Terrace");
    }

    @Override
    public Home getComplexHome() {
        return this.earthQuakeResistant;
    }
}
