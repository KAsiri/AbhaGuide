package khalidalasiri.abhaguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class ParkFragment extends Fragment {
    final ArrayList<ParkData> parkList = new ArrayList<>();
    ListView lvPark;
    ParkAdapter PA;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        // To insert the data to the list only on time
        addNewPark();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_park, container, false);
        lvPark = view.findViewById(R.id.lvPark);
        PA = new ParkAdapter(getActivity(), parkList);
        lvPark.setAdapter(PA);
        lvPark.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                double lat = 18.216797, lng = 42.503765;
                switch (position) {
                    case 0:
                        lat = 18.288936;
                        lng = 42.368156;
                        break;
                    case 1:
                        lat = 18.200029;
                        lng = 42.499815;
                        break;
                    case 2:
                        lat = 18.031861;
                        lng = 42.852280;
                        break;
                }
                Intent intent = new Intent(getContext(), MapsActivity.class);
                intent.putExtra("latitute", lat);
                intent.putExtra("longitude", lng);
                startActivity(intent);

            }
        });
        return view;
    }

    public void addNewPark() {
        parkList.add(new ParkData(getString(R.string.alsodah), getString(R.string.alsodahLocation), R.drawable.soda));
        parkList.add(new ParkData(getString(R.string.abokhalh), getString(R.string.abokhalhLocation), R.drawable.kheyal));
        parkList.add(new ParkData(getString(R.string.alhableh), getString(R.string.alhablehLocation), R.drawable.habala));
    }

}

