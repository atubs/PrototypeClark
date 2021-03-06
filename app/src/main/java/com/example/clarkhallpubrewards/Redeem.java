package com.example.clarkhallpubrewards;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Redeem extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int visits = extras.getInt("VISIT_VALUE");
            TextView textView = (TextView) findViewById(R.id.textViewNumber);
            textView.setText (visits+"");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.redeem, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_about:
                openAbout();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openAbout(){
        //Open the about screen
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void openSettings(){
        //Open the settings screen
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}
