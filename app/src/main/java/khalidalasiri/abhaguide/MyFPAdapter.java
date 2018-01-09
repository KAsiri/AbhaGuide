package khalidalasiri.abhaguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by kasir on 12/30/2017.
 */

public class MyFPAdapter extends FragmentPagerAdapter {

    int pages = 4;
    private String [] titles ;

    public MyFPAdapter(FragmentManager fm, Context c) {
        super(fm);
        titles = new String[]{c.getResources().getString(R.string.park),
                c.getResources().getString(R.string.restaurant),
                c.getResources().getString(R.string.mall),
                c.getResources().getString(R.string.event)
        };
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