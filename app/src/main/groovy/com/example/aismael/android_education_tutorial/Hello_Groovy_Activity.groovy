package com.example.aismael.android_education_tutorial

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import groovy.transform.CompileStatic

@CompileStatic
public class Hello_Groovy_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello__groovy_)
        def toolbar = (Toolbar) findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        def fab = findViewById(R.id.fab)
        fab.onClickListener={
            Snackbar.make(fab.getRootView(), "we will load next Activity", Snackbar.LENGTH_LONG).setAction("Action", null).show()
            //ILocator l = new OsmLocator()
            //l.find('Berlin').each { println it }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_hello__groovy_, menu)
        true
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId()
        if (id == R.id.action_settings) {
            return true
        }
        super.onOptionsItemSelected(item)
    }
}
