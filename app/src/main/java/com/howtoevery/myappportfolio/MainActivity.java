package com.howtoevery.myappportfolio;

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

    public void Notify1(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my @string/spotify_app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    // Message to Udacity checkers:
    // can you please tell me what is the best way to do this without creating so many similar functions?
    // also how can I use strings from the strings.xml file in the MainActivity.java file?

    public void Notify2(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my football app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void Notify3(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my library app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void Notify4(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my BuildItBigger app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void Notify5(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my XYZ Reader app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void Notify6(View view) {
        Context context = getApplicationContext();

        String message = "This button will launch my Capstone app";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
