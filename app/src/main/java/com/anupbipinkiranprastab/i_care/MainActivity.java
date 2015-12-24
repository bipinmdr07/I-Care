package com.anupbipinkiranprastab.i_care;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    private String[] listViewItems;
    private ListView listView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewItems = getResources().getStringArray(R.array.items);

        listView = (ListView) findViewById(R.id.navigation_bar);

        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_listview_item, listViewItems));

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.drawable.navigationicon, R.string.drawer_open, R.string.drawer_close);

        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        listView.setOnItemClickListener(new itemClickListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    protected void onPostCrate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }

   // @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class itemClickListener implements ListView.OnItemClickListener{

        public void onItemClick(AdapterView parent, View view, int position, long id){
            drawerLayout.closeDrawer(listView);
            switch(position){
                case 0: putFood();
            }
        }
    }

    void putFood(){
        startActivity(new Intent(this, FoodActivity.class));
    }
}
