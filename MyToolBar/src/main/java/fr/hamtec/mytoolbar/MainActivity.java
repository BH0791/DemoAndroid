package fr.hamtec.mytoolbar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        EdgeToEdge.enable( this );
        setContentView( R.layout.activity_main );
        ViewCompat.setOnApplyWindowInsetsListener( findViewById( R.id.main ), ( v, insets ) -> {
            Insets systemBars = insets.getInsets( WindowInsetsCompat.Type.systemBars( ) );
            v.setPadding( systemBars.left, systemBars.top, systemBars.right, systemBars.bottom );
            return insets;
        } );
        
        
        //? Pour qu’elle soit considérée comme une ActionBar, vous devez le dire explicitement à votre Activity qui doit
        //? obligatoirement hériter de AppCompatActivity
        //! Plus long
        // Toolbar toolbar = findViewById(R.id.toolbar); // obtenir la référence de la barre d'outils
        // setSupportActionBar(toolbar); // Définir/remplacer la barre d'outils par la barre d'action
        //! Forme plus courte
        setSupportActionBar(findViewById(R.id.toolbar));
        
        
    }
}