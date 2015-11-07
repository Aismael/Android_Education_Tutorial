package com.example.aismael.android_education_tutorial

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.OnClick
import com.arasthel.swissknife.annotations.OnItemClick
import groovy.transform.CompileStatic

@CompileStatic
public class Hello_Groovy_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello__groovy_)
        def toolbar = (Toolbar) findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        // This must be called for injection of views and callbacks to take place
        SwissKnife.inject(this);
        // This must be called for saved state restoring
        SwissKnife.restoreState(this, savedInstanceState);
        // This mus be called for automatic parsing of intent extras
        SwissKnife.loadExtras(this)
    }

    @Override
    boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_hello__groovy_, menu)
        true
    }

    @Override
    boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId()
        if (id == R.id.action_settings) {
            return true
        }
        super.onOptionsItemSelected(item)
    }

    @OnClick(R.id.fab)
     void onClick() {
        Toast.makeText(this, "we will load next Activity", Toast.LENGTH_SHORT).show()
        def i= new Intent(this, Location_Search.class)
        startActivity(i)
    }

}
