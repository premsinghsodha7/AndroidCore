package com.truckitin.base

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

@SuppressLint("SimpleDateFormat")
object DateTimeUtils {

    private val TAG = DateTimeUtils::class.java.simpleName
    private const val COMPLETE_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss"
    private const val DATE_PATTERN = "MMM d, yyyy"
    private const val TIME_PATTERN = "hh:mm a"
    private const val DATE_TIME_PATTERN = "MMM d, yyyy - hh:mm a"

    fun convertToEpoochTime(string: String?): Long {
        if(string == null) return 0
        val f = SimpleDateFormat(COMPLETE_DATE_PATTERN)
        f.timeZone = TimeZone.getTimeZone("UTC")
        return try {
            f.parse(string).time
        } catch (e: Exception) {
            0
        }
    }

    @JvmOverloads
    fun formatDate(date: String?): String {
        val timeStamp = convertToEpoochTime(date)
        return SimpleDateFormat(DATE_PATTERN).format(Date(timeStamp))
    }

    fun formatTime(date: String?): String {
        val timeStamp = convertToEpoochTime(date)
        return SimpleDateFormat(TIME_PATTERN).format(Date(timeStamp))
    }

    @JvmOverloads
    fun formatDateAndTime(date: String?): String {
        val timeStamp = convertToEpoochTime(date)
        return SimpleDateFormat(DATE_TIME_PATTERN).format(Date(timeStamp))
    }
}
