package com.demo.periodtracker.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.demo.periodtracker.OnBoardingScreen.LastPeriodInputFragment;
import com.demo.periodtracker.OnBoardingScreen.MenstrualCycleInpFragment;
import com.demo.periodtracker.OnBoardingScreen.PeriodInputFragment;


public class OnBoardingFragmentsAdapter extends FragmentStateAdapter {
    @Override 
    public int getItemCount() {
        return 3;
    }

    public OnBoardingFragmentsAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override 
    public Fragment createFragment(int i) {
        if (i != 1) {
            if (i == 2) {
                return new LastPeriodInputFragment();
            }
            return new MenstrualCycleInpFragment();
        }
        return new PeriodInputFragment();
    }
}
