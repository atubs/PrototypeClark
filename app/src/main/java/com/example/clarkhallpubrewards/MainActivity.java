package com.example.clarkhallpubrewards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends Activity {

    int visitCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textViewVisits);
        textView.setText (visitCounter+"");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void openCalender (View view) {
        //Open the calender screen
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void openRedeem (View view){
        //Open the redeem screen
        Intent intent = new Intent(this, Redeem.class);
        intent.putExtra("VISIT_VALUE",visitCounter);
        startActivity(intent);
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
