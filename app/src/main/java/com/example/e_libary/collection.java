package com.example.e_libary;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.example.e_libary.R;
import android.media.Image;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class collection extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ImageButton navButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        drawerLayout = findViewById(R.id.drawer_layout);
        navButton = findViewById(R.id.navigation_button);
        navButton.setOnClickListener(new View.OnClickListener() {
            // The Nav View Area
            @Override
            public void onClick(View v) {

                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }
}