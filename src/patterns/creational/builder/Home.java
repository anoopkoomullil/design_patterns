package patterns.creational.builder;

public class Home {
    private String floor;
    private String wall;
    private String terrace;

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTerrace(String terrace) {
        this.terrace = terrace;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", terrace='" + terrace + '\'' +
                '}';
    }
}
