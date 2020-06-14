package com.example.frgmtstatepgradptr;
import android.icu.text.Transliterator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
public class DemoFrag extends FragmentStatePagerAdapter {

    public DemoFrag(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        BlankFragment blankFragment = new BlankFragment();
        Bundle bundle = new Bundle();
        position = position + 1;
        bundle.putString( "message", "Hello From Pager: " + position );
        blankFragment.setArguments( bundle );
        return blankFragment;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
