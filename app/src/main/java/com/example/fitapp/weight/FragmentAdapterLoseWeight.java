package com.example.fitapp.weight;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapterLoseWeight extends FragmentStateAdapter {
    public FragmentAdapterLoseWeight(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position)
        {
            case 1:
                return new LoseWeightFragment2();
            case 2:
                return new LoseWeightFragment3();
            case 3:
                return new LoseWeightFragment4();
            case 4:
                return new LoseWeightFragment5();
            case 5:
                return new LoseWeightFragment6();
            case 6:
                return new LoseWeightFragment7();
        }
        return new LoseWeightFragment1();

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}

