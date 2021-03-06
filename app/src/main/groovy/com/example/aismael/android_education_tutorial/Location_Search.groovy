package com.example.aismael.android_education_tutorial

import android.content.Context
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Toast
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.OnClick
import groovy.transform.CompileStatic;



@CompileStatic
class Location_Search extends AppCompatActivity {
    Bundle savedInstanceState
    LocationManager locationManagerI
    MyLocationListener mlocListenerI

    @Override
    protected void onStart() {
        super.onStart()
        setContentView(R.layout.location_activity)
        // This must be called for injection of views and callbacks to take place
        SwissKnife.inject(this);
        // This must be called for saved state restoring
        SwissKnife.restoreState(this, savedInstanceState);
        // This mus be called for automatic parsing of intent extras
        SwissKnife.loadExtras(this)
        //location searchS
        locationManagerI = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE)
        mlocListenerI = new MyLocationListener()
        locationManagerI.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListenerI)
    }

    @OnClick(R.id.back_button)
    public void onClick() {
        Toast.makeText(baseContext, "go back to Home", Toast.LENGTH_SHORT).show()
        finish()
    }

    @OnClick(R.id.SearchButton)
    public void onClick2() {
        Toast.makeText(baseContext,"@($mlocListenerI)"
                , Toast.LENGTH_SHORT).show()
    }


}