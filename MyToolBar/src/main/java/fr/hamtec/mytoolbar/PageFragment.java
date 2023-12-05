package fr.hamtec.mytoolbar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PageFragment extends Fragment {
    private static final String KEY_POSITION = "position";
    private static final String KEY_COLOR = "color";
    
    public PageFragment( ) {
        // Constructeur public vide requis
    }
    
    // 2 - Méthode qui crée une nouvelle instance de PageFragment et ajoute des données à son paquet.
    public static PageFragment newInstance(int position, int color) {
        
        // Créer un nouveau fragment
        PageFragment frag = new PageFragment();
        
        // Créer un Bundle et lui ajouter des données
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        args.putInt(KEY_COLOR, color);
        frag.setArguments(args);
        
        return(frag);
    }
    
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        
        // Obtenir la disposition d'un PageFragment
        View result = inflater.inflate(R.layout.fragment_page, container, false);
        
        // Récupérer les widgets du layout et les sérialiser
        LinearLayout rootView= result.findViewById(R.id.fragment_page_rootview);
        TextView textView= result.findViewById(R.id.fragment_page_title);
        
        // Récupérer les données de l'offre groupée (créée dans la méthode newInstance)
        int position = getArguments().getInt(KEY_POSITION, -1);
        int color = getArguments().getInt(KEY_COLOR, -1);
        
        // Mettre à jour les widgets
        rootView.setBackgroundColor(color);
        textView.setText("Page numéro "+position);
        
        Log.e(getClass().getSimpleName(), "onCreateView appelé pour le numéro de fragment "+position);
        
        return result;
    }
    
    
}