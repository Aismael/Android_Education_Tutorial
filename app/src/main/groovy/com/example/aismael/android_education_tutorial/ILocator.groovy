package com.example.aismael.android_education_tutorial

import groovy.transform.CompileStatic

@CompileStatic
interface ILocator {

	def locate(Location location)

	Location[] find(query)

}
