package fr.hamtec.hamburgermenu;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Button btn_valider, btn_oui;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
//        EdgeToEdge.enable( this );
        setContentView( R.layout.activity_main );
        drawerLayout = findViewById( R.id.drawerLayout );
        btn_valider = findViewById( R.id.btn_valider );
        btn_oui = findViewById( R.id.btn_oui );
        
        btn_valider.setOnClickListener( vvv -> {
            Log.d( "HAMID", " btn_valider.setOnClickListener !" );
            //Toast.makeText(MainActivity.this, "Clicked on Button", Toast.LENGTH_LONG).show();
            drawerLayout.closeDrawer( Gravity.RIGHT );
        } );
        
        btn_oui.setOnClickListener( ccc -> {
            Log.d( "HAMID", " btn_oui.setOnClickListener ! " );
        } );
        
        
//        ViewCompat.setOnApplyWindowInsetsListener( findViewById( R.id.main ), ( v, insets ) -> {
//            Insets systemBars = insets.getInsets( WindowInsetsCompat.Type.systemBars( ) );
//            v.setPadding( systemBars.left, systemBars.top, systemBars.right, systemBars.bottom );
//            return insets;
//        } );
    }
    //! Attention de bient mettre le LineareLayout avec le menuDrawerLayout en premier dans le fichier xml
    //! sinon le click ne fonctionne pas ==> mais le panneau ne ce ferme plus
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        getMenuInflater().inflate( R.menu.main_menu, menu );
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {
        
        if ( item.getItemId( ) == R.id.hamburgerMenu ) {
            //! Si le panneau est a droite, il faut bien mettre a droite ici aussi
            drawerLayout.openDrawer( Gravity.RIGHT );
            return true;
        }
        return super.onOptionsItemSelected( item );
        
        
    }
    //! Ancienne façon de faire avec android:onClick="momo" dans le fichier xml pour le boutton
    public void momo( View v){
        Log.d( "HAMID", "momo: " );
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume( ) {
        super.onResume( );
        
    }
    
}