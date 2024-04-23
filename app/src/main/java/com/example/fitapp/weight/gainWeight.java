package com.example.fitapp.weight;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fitapp.Model3;
import com.example.fitapp.R;
import com.example.fitapp.gainAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class gainWeight extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapterGainWeight adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gain_weight);

        Toolbar toolbar = findViewById(R.id.toolbar2); //toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.viewpager2);
        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapterGainWeight(fm, getLifecycle());
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

    }
    private ArrayList<Model3>getMyList(){
        ArrayList<Model3> models = new ArrayList<>();
        Model3 m = new Model3();
        m.setTitle("Biceps Curls");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.dumbbell3);
        models.add(m);

        m = new Model3();
        m.setTitle("Triceps extension");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.dumbbell);
        models.add(m);

        m = new Model3();
        m.setTitle("Bench Press");
        m.setDescription("10 reps, 5 sets");
        m.setImg(R.drawable.powerlifting3);
        models.add(m);

        m = new Model3();
        m.setTitle("Overhead press");
        m.setDescription("10 reps, 5 sets");
        m.setImg(R.drawable.powerlifting);
        models.add(m);

        m = new Model3();
        m.setTitle("Chin-Up");
        m.setDescription("10 reps, 5 sets");
        m.setImg(R.drawable.bar);
        models.add(m);

        m = new Model3();
        m.setTitle("Triceps dip");
        m.setDescription("10 reps, 5 sets");
        m.setImg(R.drawable.barup);
        models.add(m);

        m = new Model3();
        m.setTitle("Glute bridge");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.powerlifting3);
        models.add(m);

        m = new Model3();
        m.setTitle("Reverse flye");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.dumbbell2);
        models.add(m);

        m = new Model3();
        m.setTitle("Seated incline curl");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.seat);
        models.add(m);

        m = new Model3();
        m.setTitle("Incline dumbbell press");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.seat);
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
