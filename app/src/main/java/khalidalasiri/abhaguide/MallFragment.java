package khalidalasiri.abhaguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MallFragment extends Fragment {

    private int page = 2;
    private String title = Resources.getSystem().getString(R.string.mall);

    public MallFragment() {
        // Required empty public constructor
    }
    public static MallFragment newInstance(int page, String title) {
        MallFragment fragment = new MallFragment();
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
        return inflater.inflate(R.layout.fragment_mall, container, false);
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
