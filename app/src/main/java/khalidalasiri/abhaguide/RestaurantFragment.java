package khalidalasiri.abhaguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    final ArrayList<RestaurantData> restList = new ArrayList<>();
    ListView lvRest;
    RestaurantAdapter RA;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        // To insert the data to the list only one time
        addNewRestaurant();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        lvRest = view.findViewById(R.id.lvRest);
        RA = new RestaurantAdapter(getActivity(), restList);
        lvRest.setAdapter(RA);
        return view;
    }

    public void addNewRestaurant() {
        restList.add(new RestaurantData(getString(R.string.naranj), getString(R.string.naranjLoc), getString(R.string.naranjRate)));
        restList.add(new RestaurantData(getString(R.string.revolving), getString(R.string.revolvingLoc), getString(R.string.revolvingRate)));
        restList.add(new RestaurantData(getString(R.string.original), getString(R.string.originalLoc), getString(R.string.originalRate)));
        restList.add(new RestaurantData(getString(R.string.lobster), getString(R.string.lobsterLoc), getString(R.string.lobsterRate)));
    }


}
