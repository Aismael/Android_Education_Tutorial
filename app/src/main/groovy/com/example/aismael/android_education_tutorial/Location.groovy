package com.example.aismael.android_education_tutorial

import groovy.transform.CompileStatic

@CompileStatic
class Location {
	String name
	String city
	String street
	String postalCode
	String country
	double latitude
	double longitude

	String toString() { "location[name=$name, city=$city, street=$street]@($latitude, $longitude)" }
}
