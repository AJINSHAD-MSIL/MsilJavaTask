package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position)
        {
            case 0 :
                fragment = UserProfile.getInstance();
                break;
            case 1 : fragment = new Fragment2();
                break;
            case 2 : fragment = new Fragment3();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "UserDetails";
        }
        else if (position == 1)
        {
            title = "TAB2";
        }
        else if (position == 2)
        {
            title = "TAB3";
        }
        return title;
    }


}
