package khalidalasiri.abhaguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kasir on 1/5/2018.
 */

public class ParkAdapter extends ArrayAdapter<ParkData> {
    public ParkAdapter(Context context, ArrayList<ParkData> parkdata) {
        super(context, 0, parkdata);
    }

    public View getView(int index, View convertView, ViewGroup parent) {
        ParkData parkdata = getItem(index);

        View park_item = convertView;
        if (park_item == null) {
            park_item = LayoutInflater.from(getContext()).inflate(R.layout.listview_items, parent, false);
        }
        ImageView image = park_item.findViewById(R.id.image);
        TextView name = park_item.findViewById(R.id.tv_name);
        TextView location = park_item.findViewById(R.id.tv_location);

        image.setImageResource(parkdata.getParkImageResource());
        name.setText(parkdata.getParkName());
        location.setText(parkdata.getParkLocation());

        return park_item;

    }

}
