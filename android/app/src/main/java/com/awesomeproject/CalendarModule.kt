package com.awesomeproject

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log
import com.facebook.react.bridge.Callback

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName() = "CalendarModule"

    @ReactMethod
    fun createCalendarEvent(name: String, location: String, myFailureCallback: Callback, mySuccessCallback: Callback) {
        Log.d("CalendarModule", "Create event called with name: $name and location: $location")

        val eventId = 123456
        mySuccessCallback.invoke(eventId)
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