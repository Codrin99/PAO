package pachet;

public class Room{
    private String nr;
    private String type;
    private Integer floor;

    public Room(String nr, String type, int floor){
        this.floor = floor;
        this.nr = nr;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public void print( ){
        System.out.println("Room number is: " + this.nr);
        System.out.println("Room type: " + this.type);
        System.out.println("Room floor: " + this.floor);
        System.out.println("");
    }

}

