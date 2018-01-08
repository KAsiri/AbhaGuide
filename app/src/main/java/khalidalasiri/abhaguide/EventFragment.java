package khalidalasiri.abhaguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventFragment extends Fragment {
    final ArrayList<EventData> eventList = new ArrayList<>();
    ListView lvEvent;
    EventAdapter EA;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        // To insert the data to the list only one time
        addNewEvent();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        lvEvent = view.findViewById(R.id.lvEvent);
        EA = new EventAdapter(getActivity(), eventList);
        lvEvent.setAdapter(EA);
        return view;
    }

    public void addNewEvent() {
        eventList.add(new EventData(getString(R.string.fireworks), getString(R.string.fireworksLoc), getString(R.string.fireworksTime)));
        eventList.add(new EventData(getString(R.string.art), getString(R.string.artLoc), getString(R.string.artTime)));
        eventList.add(new EventData(getString(R.string.shop), getString(R.string.shopLoc), getString(R.string.shopTime)));
    }

}
