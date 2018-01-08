package khalidalasiri.abhaguide;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by kasir on 12/30/2017.
 */

public class MyFPAdapter extends FragmentPagerAdapter {

    int pages = 4;
    Resources r = Resources.getSystem();
    private String[] titles = new String[]{"Park", "Restaurant", "Mall", "Event"};
            /*
            r.getString(R.string.park),
            r.getString(R.string.restaurant),
            r.getString(R.string.mall),
            r.getString(R.string.event)};
            */

    public MyFPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return pages;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParkFragment();
            case 1:
                return new RestaurantFragment();
            case 2:
                return new MallFragment();
            case 3:
                return new EventFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return titles[position];
    }

}
