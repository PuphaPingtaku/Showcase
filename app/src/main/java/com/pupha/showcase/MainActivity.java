package com.pupha.showcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        FactorialFragment factorialFragment= new FactorialFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_main, factorialFragment, "FindFactorialFragment")
//                .addToBackStack(null)
                .commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            FactorialFragment nextFrag= new FactorialFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_main, nextFrag, "FindFactorialFragment")
//                .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_gallery) {

            ReversalFragment nextFrag= new ReversalFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_main, nextFrag, "FindReversalFragment")
//                .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_slideshow) {

            SoupFragment nextFrag= new SoupFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_main, nextFrag, "FindSoupFragment")
//                .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_tools) {

            PalindromeFragment nextFrag= new PalindromeFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_main, nextFrag, "FindPalindromeFragment")
//                .addToBackStack(null)
                    .commit();

        }   else if (id == R.id.nav_setting) {

            startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);

        }
//        else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
