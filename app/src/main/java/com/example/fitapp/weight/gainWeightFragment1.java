package com.example.fitapp.weight;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitapp.Model3;
import com.example.fitapp.R;
import com.example.fitapp.gainAdapter;

import java.util.ArrayList;

public class gainWeightFragment1 extends Fragment {
    RecyclerView mRecyclerView;
    gainAdapter myAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gain_weight, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myAdapter = new gainAdapter(getContext(), getMyList());
        mRecyclerView.setAdapter(myAdapter);
        return view;
    }
    private ArrayList<Model3>getMyList(){
        ArrayList<Model3> models = new ArrayList<>();
        Model3 m = new Model3();
        m.setTitle("Biceps Curls");
        m.setDescription("12 reps, 3 sets");
        m.setImg(R.drawable.dumbbell3);
        models.add(m);

        return models;
    }
}