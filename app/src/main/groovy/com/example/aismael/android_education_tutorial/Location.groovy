package com.example.aismael.android_education_tutorial

import android.location.Location
import android.location.LocationListener
import android.os.Bundle


/* Class My Location Listener */

class MyLocationListener implements LocationListener {
    def la, lo

    String toString() {
        "@($la, $lo)"
    }

    @Override
    public void onLocationChanged(Location loc) {
        la = loc.getLatitude()
        lo = loc.getLongitude()
        println(this.toString())
    }

    @Override
    public void onProviderDisabled(String provider) {
        println("Gps Disabled")
    }

    @Override
    public void onProviderEnabled(String provider) {
        println("Gps Enabled")
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}




