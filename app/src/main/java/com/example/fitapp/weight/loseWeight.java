package com.example.fitapp.weight;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fitapp.Model;
import com.example.fitapp.MyAdapter;
import com.example.fitapp.R;
import com.example.fitapp.weight.FragmentAdapterGainWeight;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class loseWeight extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapterLoseWeight adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose_weight);

        Toolbar toolbar = findViewById(R.id.toolbar2); //toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.viewpager2);
        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapterLoseWeight(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Day  1"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 4"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 5"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 6"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 7"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });



//        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        myAdapter = new MyAdapter(this, getMyList());
//        mRecyclerView.setAdapter(myAdapter);

    }
    private ArrayList<Model>getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("Bent-over Row");
        m.setDescription("10 reps, 3 sets");
        m.setImg(R.drawable.dumbbell2);
        models.add(m);

        m = new Model();
        m.setTitle("Romanian Deadlift");
        m.setDescription("10 reps, 3 sets");
        m.setImg(R.drawable.dumbbell);
        models.add(m);

        return models;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) //toolbar back
    {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
