package com.example.viewpager2tabs;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class SectionsPagerAdapter extends FragmentStateAdapter {
    private final Context context;

    public SectionsPagerAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.context = context;
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentHome();
            case 1:
                return new FragmentPrincipal();
            case 2:
                return new FragmentSlidshow();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
