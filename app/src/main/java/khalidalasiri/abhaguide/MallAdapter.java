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
 * Created by kasir on 1/7/2018.
 */

public class MallAdapter extends ArrayAdapter<MallData> {
    public MallAdapter(Context context, ArrayList<MallData> mallData) {
        super(context, 0, mallData);
    }

    public View getView(int index, View convertView, ViewGroup parent) {
        MallData mallData = getItem(index);

        View mall_item = convertView;
        if (mall_item == null) {
            mall_item = LayoutInflater.from(getContext()).inflate(R.layout.listview_items, parent, false);
        }
        ImageView image = mall_item.findViewById(R.id.image);
        TextView name = mall_item.findViewById(R.id.tv_name);
        TextView location = mall_item.findViewById(R.id.tv_location);

        image.setImageResource(mallData.getMallImageResource());
        name.setText(mallData.getMallName());
        location.setText(mallData.getMallLocation());

        return mall_item;

    }
}
