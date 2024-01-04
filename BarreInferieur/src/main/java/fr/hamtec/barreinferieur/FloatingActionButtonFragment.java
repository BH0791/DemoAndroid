package fr.hamtec.barreinferieur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class FloatingActionButtonFragment extends Fragment {
    
    public FloatingActionButtonFragment( ) {
        // Required empty public constructor
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_floating_action_button, container, false );
    }
}