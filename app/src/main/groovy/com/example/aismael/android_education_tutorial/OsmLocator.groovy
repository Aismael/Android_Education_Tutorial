package com.example.aismael.android_education_tutorial

import groovy.util.slurpersupport.GPathResult;

class OsmLocator extends AbstractLocator {

	static main(args) {
		ILocator l = new OsmLocator()
//		def fernsehturm = l.locate(new Location(name:'Fernsehturm', city:'Berlin', country: 'Germany'));
//		println fernsehturm

		l.find('Berlin').each { println it }
	}

	OsmLocator() {
		super('http://nominatim.openstreetmap.org/search?q=$q',
		[format: 'xml', addressdetails: 1])
	}

	Location[] find(query) {
		this.search(query).place.collect {
			new Location(
					city:it.city ?: it.town,
					country:it.country,
					latitude:it.@lat.toDouble(),
					longitude:it.@lon.toDouble())
		}
	}

	def locate(Location location) {
		def response = this.search(this.serializeLocation(location))
		location.latitude = response.place.@lat.toDouble()
		location.longitude = response.place.@lon.toDouble()
		return location
	}
}

