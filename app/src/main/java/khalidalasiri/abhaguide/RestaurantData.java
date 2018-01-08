package khalidalasiri.abhaguide;

/**
 * Created by kasir on 1/7/2018.
 */

public class RestaurantData {
    private String restName, restLocation;
    private String restRate;

    public RestaurantData(String restName, String restLocation, String restRate) {
        this.restName = restName;
        this.restLocation = restLocation;
        this.restRate = restRate;
    }

    public String getRestName() {

        return restName;
    }

    public String getRestLocation() {
        return restLocation;
    }

    public String getRestRate() {

        return restRate;
    }
}
