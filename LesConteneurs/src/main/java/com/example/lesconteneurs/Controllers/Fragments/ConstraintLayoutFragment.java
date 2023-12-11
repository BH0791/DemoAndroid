package com.example.lesconteneurs.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesconteneurs.R;

public class ConstraintLayoutFragment extends Fragment {
    
    public ConstraintLayoutFragment( ) {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        
        return inflater.inflate( R.layout.fragment_constraint_layout, container, false );
    }
}