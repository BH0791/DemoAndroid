## bottomappbar 
*com.google.android.material.bottomappbar*


>Définition google :<br>La barre d'application inférieure est une extension de la barre d'outils qui prend en charge un arrière-plan façonné qui "accueille" un bouton d'action flottant.
>Les barres d'application inférieures permettent d'accéder à un tiroir de navigation inférieur et à un maximum de quatre actions, y compris le bouton d'action flottant.

J’ai mis trois icons et chacun d’entre eux affiche un fragment home, person et setting.
Le FAB affiche une MaterialAlertDialogBuilder avec trois choix qui affiche un Snackbar pour chaque action. En même temps, un fragment lui est dédier.

```
<?xml version="1.0" encoding="utf-8"?>


<androidx.coordinatorlayout.widget.CoordinatorLayout
        ...
        android:layout_width = "match_parent"
        android:layout_height = "match_parent"
        >
    
        
        <!-- Scrollable content => Contenu défilable -->
        
        <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:id="@+id/main_cont"
                >
        
        
        </androidx.constraintlayout.widget.ConstraintLayout>
    
    
    <com.google.android.material.bottomappbar.BottomAppBar
            android:id = "@+id/bottomNavigationView"
            android:layout_width = "match_parent"
            android:layout_height = "wrap_content"
            android:layout_gravity = "bottom"
            style = "@style/Widget.Material3.BottomAppBar"
            app:navigationIcon = "@drawable/ic_drawer_menu_24px"
            app:menu = "@menu/bottom_app_bar"
            app:hideOnScroll="true"
            />
    
    <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width = "wrap_content"
            android:layout_height = "wrap_content"
            app:srcCompat = "@drawable/ic_add_24dp"
            app:layout_anchor = "@id/bottomNavigationView"
            />
    
    <FrameLayout
            android:id = "@+id/flFragment"
            android:layout_width = "match_parent"
            android:layout_height = "match_parent"
            app:layout_anchorGravity = "center"
            app:layout_anchor = "@+id/main_cont"
            />

</androidx.coordinatorlayout.widget.CoordinatorLayout >
```
