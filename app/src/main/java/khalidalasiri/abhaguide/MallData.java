package khalidalasiri.abhaguide;

/**
 * Created by kasir on 1/7/2018.
 */

public class MallData {
    private String mallName, mallLocation;
    private int mallImageResource;

    public MallData(String mallName, String parkLocation, int parkImageResource) {
        this.mallName = mallName;
        this.mallLocation = parkLocation;
        this.mallImageResource = parkImageResource;
    }


    public String getMallName() {
        return mallName;
    }

    public String getMallLocation() {
        return mallLocation;
    }

    public int getMallImageResource() {
        return mallImageResource;
    }
}
