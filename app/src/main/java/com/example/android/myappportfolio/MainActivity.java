package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toast1(View view) {
        showToaster("Spotify Streamer");
    }

    public void toast2(View view) {
        showToaster("Scores App");
    }

    public void toast3(View view) {
        showToaster("Library App");
    }

    public void toast4(View view) {
        showToaster("Build It Bigger");
    }

    public void toast5(View view) {
        showToaster("XYZ Reader");
    }

    public void toast6(View view) {
        showToaster("Capstone App");
    }

    public void showToaster(final String toastMsg) {
        Context context = getApplicationContext();

        String msg = "This button will launch my " + toastMsg;
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
