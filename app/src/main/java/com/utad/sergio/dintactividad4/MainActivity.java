package com.utad.sergio.dintactividad4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    MainActivityEvents events;
    FragmentTransaction transition;
    MainFragment main;
    ShoppingFragment shopping;
    InboxFragment inbox;
    ProfileFragment profile;
    VideogamesFragment videogames;
    AboutFragment about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        events = new MainActivityEvents(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(events);

        main = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        shopping = (ShoppingFragment) getSupportFragmentManager().findFragmentById(R.id.shoppingFragment);
        inbox = (InboxFragment) getSupportFragmentManager().findFragmentById(R.id.inboxFragment);
        profile = (ProfileFragment) getSupportFragmentManager().findFragmentById(R.id.profileFragment);
        videogames = (VideogamesFragment) getSupportFragmentManager().findFragmentById(R.id.videogamesFragment);
        about = (AboutFragment) getSupportFragmentManager().findFragmentById(R.id.aboutFragment);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(main);
        transition.hide(shopping);
        transition.hide(inbox);
        transition.hide(profile);
        transition.hide(videogames);
        transition.hide(about);
        transition.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void botonClicked(View v){
        transition = getSupportFragmentManager().beginTransaction();
        transition.show(about);
        transition.hide(main);
        transition.hide(shopping);
        transition.hide(inbox);
        transition.hide(profile);
        transition.hide(videogames);
        transition.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            transition = getSupportFragmentManager().beginTransaction();
            transition.show(about);
            transition.hide(main);
            transition.hide(shopping);
            transition.hide(inbox);
            transition.hide(profile);
            transition.hide(videogames);
            transition.commit();
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_shopping) {
            transition = getSupportFragmentManager().beginTransaction();
            transition.show(shopping);
            transition.hide(main);
            transition.hide(inbox);
            transition.hide(profile);
            transition.hide(videogames);
            transition.hide(about);
            transition.commit();
        } else if (id == R.id.nav_inbox) {
            transition = getSupportFragmentManager().beginTransaction();
            transition.show(inbox);
            transition.hide(main);
            transition.hide(shopping);
            transition.hide(profile);
            transition.hide(videogames);
            transition.hide(about);
            transition.commit();
        } else if (id == R.id.nav_profile) {
            transition = getSupportFragmentManager().beginTransaction();
            transition.show(profile);
            transition.hide(main);
            transition.hide(shopping);
            transition.hide(inbox);
            transition.hide(videogames);
            transition.hide(about);
            transition.commit();
        } else if (id == R.id.nav_videogames) {
            transition = getSupportFragmentManager().beginTransaction();
            transition.show(videogames);
            transition.hide(main);
            transition.hide(inbox);
            transition.hide(shopping);
            transition.hide(profile);
            transition.hide(about);
            transition.commit();
        } else if (id == R.id.nav_sell) {

        } else if (id == R.id.nav_transactions) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

class MainActivityEvents implements View.OnClickListener {

    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.fab){
            Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }
}
