package deso2.nhom10.appcake.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;


import deso2.nhom10.appcake.HomeFragment;
import deso2.nhom10.appcake.MenuFragment;
import deso2.nhom10.appcake.OrderFragment;
import deso2.nhom10.appcake.ProfileFragment;

public class ViewPageAdapter extends FragmentPagerAdapter
{

    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new OrderFragment();
            case 2:
                return new MenuFragment();
            case 3:
                return new ProfileFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
