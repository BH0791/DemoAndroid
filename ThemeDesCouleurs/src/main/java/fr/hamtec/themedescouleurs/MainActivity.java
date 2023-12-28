package fr.hamtec.themedescouleurs;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        
        
//        EdgeToEdge.enable( this );
        setContentView( R.layout.activity_button );
//        ViewCompat.setOnApplyWindowInsetsListener( findViewById( R.id.main ), ( v, insets ) -> {
//            Insets systemBars = insets.getInsets( WindowInsetsCompat.Type.systemBars( ) );
//            v.setPadding( systemBars.left, systemBars.top, systemBars.right, systemBars.bottom );
//            return insets;
//        } );
        
//        Button button = findViewById( R.id.button );
//        button.setOnClickListener( v -> {
//       new  MaterialAlertDialogBuilder(this)
//                .setMessage("This is a test of MaterialAlertDialogBuilder")
//               .setTitle( "Ma boîte" )
//                .setPositiveButton("Ok", null)
//                .show();
//        } );
    }
}