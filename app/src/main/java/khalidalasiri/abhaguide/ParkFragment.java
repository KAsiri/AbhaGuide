package khalidalasiri.abhaguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ParkFragment extends Fragment {

    private int page = 0;
    private String title = Resources.getSystem().getString(R.string.park);

    public ParkFragment() {
        // Required empty public constructor
    }
    public static ParkFragment newInstance(int page, String title) {
        ParkFragment fragment = new ParkFragment();
        Bundle args = new Bundle();
        args.putInt("Page", page);
        args.putString("Title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt("",page);
            title = getArguments().getString(title);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_park, container, false);
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
