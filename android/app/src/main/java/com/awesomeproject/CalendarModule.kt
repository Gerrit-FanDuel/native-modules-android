package com.awesomeproject

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName() = "CalendarModule"

    @ReactMethod
    fun createCalendarEvent(name: String, location: String, promise: Promise) {
        try {
            val eventId = 123456
            promise.resolve(eventId)
        } catch (e: Throwable) {
            promise.reject("Create Event Error", "Error parsing data", e)
        }
    }

//    val dateFormat = "yyyy-MM-dd"
//    val sdf = SimpleDateFormat(dateFormat, Locale.US)
//    val eStartDate = Calendar.getInstance()
//    try {
//        sdf.parse(startDate)?.let {
//            eStartDate.time = it
//        }
//    }

    override fun getConstants(): MutableMap<String, Any> =
        hashMapOf("DEFAULT_EVENT_NAME" to "New Event")

}