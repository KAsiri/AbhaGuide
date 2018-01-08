package khalidalasiri.abhaguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kasir on 1/7/2018.
 */

public class RestaurantAdapter extends ArrayAdapter<RestaurantData> {
    public RestaurantAdapter(Context context, ArrayList<RestaurantData> restaurantData) {
        super(context, 0, restaurantData);
    }

    public View getView(int index, View convertView, ViewGroup parent) {
        RestaurantData restaurantData = getItem(index);

        View rest_item = convertView;
        if (rest_item == null) {
            rest_item = LayoutInflater.from(getContext()).inflate(R.layout.listview_item2, parent, false);
        }
        TextView name = rest_item.findViewById(R.id.tv_name);
        TextView location = rest_item.findViewById(R.id.tv_location);
        TextView rate = rest_item.findViewById(R.id.tv_moreinfo);

        name.setText(restaurantData.getRestName());
        location.setText(restaurantData.getRestLocation());
        rate.setText(restaurantData.getRestRate());

        return rest_item;

    }
}
