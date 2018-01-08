package khalidalasiri.abhaguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallFragment extends Fragment {
    final ArrayList<MallData> mallList = new ArrayList<>();
    ListView lvMall;
    MallAdapter MA;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        // To insert the data to the list only on time
        addNewMall();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mall, container, false);
        lvMall = view.findViewById(R.id.lvMall);
        MA = new MallAdapter(getActivity(), mallList);
        lvMall.setAdapter(MA);
        return view;
    }

    public void addNewMall() {
        mallList.add(new MallData(getString(R.string.asir), getString(R.string.asirLoc), R.drawable.asir_mall));
        mallList.add(new MallData(getString(R.string.rashed), getString(R.string.rashedLoc), R.drawable.rashed_mall));
        mallList.add(new MallData(getString(R.string.abha), getString(R.string.abhaLoc), R.drawable.abha_mall));
        mallList.add(new MallData(getString(R.string.rihana), getString(R.string.rihanaLoc), R.drawable.rihana_mall));
    }
}
