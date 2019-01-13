package com.example.ashwanithakur.myapplication;


import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import  android.support.v7.widget.Toolbar;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;




public class database extends AppCompatActivity  implements  NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        toolbar=findViewById(R.id.toolbar);
        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigation);


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();
        toolbar.setNavigationIcon(R.drawable.ic_more_vert_black_24dp);



        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
         if (drawerLayout.isDrawerOpen(GravityCompat.START)){

             drawerLayout.closeDrawer(GravityCompat.START);
         }

        else{
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected( MenuItem menuItem) {


        switch(menuItem.getItemId()){


            case R.id.home:
                Intent intent=new Intent(database.this,loginadmin.class);
                startActivity(intent);
                finish();
                break;
            case R.id.order:
                break;
            case R.id.message:
                break;
            default:
                break;


        }





        return true;
    }
}
