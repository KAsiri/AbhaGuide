package khalidalasiri.abhaguide;


/**
 * Created by kasir on 1/4/2018.
 */

public class ParkData {
    private String parkName, parkLocation;
    private int parkImageResource;

    public ParkData(String parkName, String parkLocation, int parkImageResource) {
        this.parkName = parkName;
        this.parkLocation = parkLocation;
        this.parkImageResource = parkImageResource;
    }


    public String getParkName() {
        return parkName;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public int getParkImageResource() {
        return parkImageResource;
    }
}
