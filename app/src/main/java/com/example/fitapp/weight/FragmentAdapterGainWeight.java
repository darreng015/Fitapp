package com.example.fitapp.weight;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fitapp.weight.gainWeightFragment1;

public class FragmentAdapterGainWeight extends FragmentStateAdapter {
    public FragmentAdapterGainWeight(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch(position)
            {
                case 1:
                    return new gainWeightFragment2();
                case 2:
                    return new gainWeightFragment3();
                case 3:
                    return new gainWeightFragment4();
                case 4:
                    return new gainWeightFragment5();
                case 5:
                    return new gainWeightFragment6();
                case 6:
                    return new gainWeightFragment7();
            }
           return new gainWeightFragment1();

        }

        @Override
        public int getItemCount() {
            return 7;
        }
}
