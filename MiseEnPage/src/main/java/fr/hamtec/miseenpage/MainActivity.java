package fr.hamtec.miseenpage;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton fab;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
//        EdgeToEdge.enable( this );
        setContentView( R.layout.activity_coordinatorlayout );
//        ViewCompat.setOnApplyWindowInsetsListener( findViewById( R.id.main ), ( v, insets ) -> {
//            Insets systemBars = insets.getInsets( WindowInsetsCompat.Type.systemBars( ) );
//            v.setPadding( systemBars.left, systemBars.top, systemBars.right, systemBars.bottom );
//            return insets;
//        } );
        fab = findViewById( R.id.button );
        fab.setOnClickListener( ss -> {
            Snackbar.make(ss, "Hey Button. Define a Custom Behaviour. Else I'll take your space", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } );
    }
}