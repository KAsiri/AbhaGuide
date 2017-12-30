package khalidalasiri.abhaguide;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kasir on 12/30/2017.
 */

public class MyFPAdapter extends FragmentPagerAdapter {

    private int NUM_ITEMS = 4;

    private String[] titles = new String[]{Resources.getSystem().getString(R.string.park),
            Resources.getSystem().getString(R.string.restaurant),
            Resources.getSystem().getString(R.string.mall),
            Resources.getSystem().getString(R.string.event)};

    public MyFPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ParkFragment.newInstance(0,titles[0]);
            case 1:
                return RestaurantFragment.newInstance(1,titles[1]);
            case 2:
                return MallFragment.newInstance(2,titles[2]);
            case 3:
                return EventFragment.newInstance(3,titles[3]);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
