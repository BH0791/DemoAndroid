package fr.hamtec.barreinferieur;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn_homme;
    FrameLayout frameLayout;
    BottomAppBar bottomAppBar;
    
    
    private static final String TAG = "HB";
    
    HomeFragment homeFragment = new HomeFragment( );
    PersonFragment personFragment = new PersonFragment( );
    SettingFragment settingFragment = new SettingFragment( );
    FloatingActionButtonFragment floatingActionButtonFragment = new FloatingActionButtonFragment( );
    FloatingActionButton floatingActionButton;
    
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
        
        
        bottomAppBar = findViewById( R.id.bottomNavigationView );
        bottomAppBar.replaceMenu( R.menu.bottom_app_bar );
        
        floatingActionButton = findViewById( R.id.fab );
        bottomAppBar.setOnMenuItemClickListener( new Toolbar.OnMenuItemClickListener( ) {
            @Override
            public boolean onMenuItemClick( MenuItem item ) {
                
                int itemId = item.getItemId( );
                if ( itemId == R.id.person ) {
                    Log.d( TAG, "onMenuItemClick: person" );
                    
                    openFrament( personFragment );
                    
                } else if ( itemId == R.id.home ) {
                    Log.d( TAG, "onMenuItemClick: home" );
                    openFrament( homeFragment );
                } else if ( itemId == R.id.setting ) {
                    Log.d( TAG, "onMenuItemClick: setting" );
                    openFrament( settingFragment );
                }
                
                return true;
            }
        } );
        
        floatingActionButton.setOnClickListener( view -> {
            openFrament( floatingActionButtonFragment );
                    
                    new MaterialAlertDialogBuilder( this )
                            .setTitle( "Titre" )
                            .setMessage( "Message" )
                            .setNeutralButton( getResources().getString( R.string.btn_neutral ), (fr, gt) ->{
                                Snackbar.make( view, "NeutralButton", Snackbar.LENGTH_LONG ).setAction( "Action", null ).show( );
                            } )
                            .setNegativeButton( getResources().getString( R.string.btn_negative ), (fr, gt) ->{
                                Snackbar.make( view, "NegativeButton", Snackbar.LENGTH_LONG ).setAction( "Action", null ).show( );
                            } )
                            .setPositiveButton( getResources().getString( R.string.btn_positive ), (fr, gt) ->{
                                Snackbar.make( view, "PositiveButton", Snackbar.LENGTH_LONG ).setAction( "Action", null ).show( );
                            } )
                            .setIcon( R.drawable.ic_add_24dp )
                            .show( );
                    
                    
                });
        
        
        
        openFrament( homeFragment );
        
    }
    
    FragmentManager fragmentManager;
    FragmentTransaction transaction;
    
    private void openFrament( Fragment fragment ) {
        fragmentManager = getSupportFragmentManager( );
        transaction = fragmentManager.beginTransaction( );
        transaction.replace( R.id.main_cont, fragment );
        transaction.addToBackStack( null );
        transaction.commit( );
    }
    
    
}
