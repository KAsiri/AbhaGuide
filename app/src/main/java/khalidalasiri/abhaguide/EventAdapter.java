package khalidalasiri.abhaguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kasir on 1/8/2018.
 */

public class EventAdapter extends ArrayAdapter<EventData> {
    public EventAdapter(Context context, ArrayList<EventData> eventData) {
        super(context, 0, eventData);
    }

    public View getView(int index, View convertView, ViewGroup parent) {
        EventData eventData = getItem(index);

        View event_item = convertView;
        if (event_item == null) {
            event_item = LayoutInflater.from(getContext()).inflate(R.layout.listview_item2, parent, false);
        }
        TextView name = event_item.findViewById(R.id.tv_name);
        TextView location = event_item.findViewById(R.id.tv_location);
        TextView time = event_item.findViewById(R.id.tv_moreinfo);

        name.setText(eventData.getEventName());
        location.setText(eventData.getEventLocation());
        time.setText(eventData.getEventTime());

        return event_item;

    }
}
