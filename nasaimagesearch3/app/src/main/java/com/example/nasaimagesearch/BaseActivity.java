package com.example.nasaimagesearch;

import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the toolbar menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle toolbar item selection
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String toolbarTitle = (String) getSupportActionBar().getTitle();

        // Log the selected item ID for debugging purposes
        Log.d("Navigation", "Selected item ID: " + item.getItemId());

        // Switch based on the item ID selected from the menu
        switch (item.getItemId()) {
            case 2131165300:  // Replace with the actual value from R.id.navMain (You can find this value in your R.java)
                if (!toolbarTitle.contains("Main")) {
                    Intent mainPage = new Intent(this, MainActivity.class);
                    startActivity(mainPage);
                }
                break;

            case 2131165301:  // Replace with the actual value from R.id.navHome
                if (!toolbarTitle.contains("Home")) {
                    Intent homePage = new Intent(this, HomeActivity.class);
                    startActivity(homePage);
                }
                break;

            case 2131165302:  // Replace with the actual value from R.id.navSearch
                if (!toolbarTitle.contains("Search")) {
                    Intent searchPage = new Intent(this, SearchActivity.class);
                    startActivity(searchPage);
                }
                break;

            case 2131165303:  // Replace with the actual value from R.id.navFavourites
                if (!toolbarTitle.contains("Favourites")) {
                    Intent favouritesPage = new Intent(this, FavouritesActivity.class);
                    startActivity(favouritesPage);
                }
                break;

            default:
                return false;
        }

        // Close the navigation drawer after selecting an item
        DrawerLayout drawer = findViewById(R.id.drawer);  // Ensure 'drawer' ID exists in your layout
        if (drawer != null) {
            drawer.closeDrawer(GravityCompat.START);
        }

        return true;
    }
}