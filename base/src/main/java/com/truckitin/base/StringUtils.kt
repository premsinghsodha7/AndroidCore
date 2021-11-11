package com.truckitin.base

import android.graphics.Color
import android.text.SpannableString
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import java.util.*

fun removeSpecialChars(value: String): String {
    return value.replace(Regex("[^a-zA-Z0-9]"), "")
}

fun removeLeadingZeros(value: String): String {
    return value.trimStart('0')
}

fun String?.hasText(): Boolean {
    return this != null && this.isNotEmpty()
}

/**
 * @param calls the block if data is non null and non empty
 */
fun String?.NAE(nonNull: (String) -> Unit) {
    if (this.hasText()) {
        nonNull.invoke(this!!)
    }
}

/**
 * @param calls the block if data is non null and non empty
 */
fun String?.NAE(nonNull: (String) -> Unit, nullOrEmpty: () -> Unit) {
    if (this.hasText()) {
        nonNull.invoke(this!!)
    }else{
        nullOrEmpty.invoke()
    }
}

fun extractInitials(name: String?): String {
    name?.let {
        val str = StringBuilder()
        val indexOf = name.trim { it <= ' ' }.indexOf(" ")
        str.append(name.substring(0, 1).toUpperCase(Locale.ENGLISH))

        if (indexOf > 0) {
            str.append(name[indexOf + 1])
        } else {
            str.delete(0, str.capacity())
            str.append(if (name.length > 2) name.substring(0, 2) else 1)
        }
        return str.toString().toUpperCase(Locale.ENGLISH)
    } ?: run {
        return ""
    }
}

fun String.IsInt(): Boolean {
    return try {
        this.toInt()
        true
    } catch (ex: Exception) {
        false
    }
}

@JvmOverloads
fun String.setFontSizeForPath(path: String, fontSizeInDp: Int, colorCode: String = "#000000"): SpannableString {
    val spannable = SpannableString(this)
    val startIndexOfPath = spannable.toString().indexOf(path)
    spannable.setSpan(
        AbsoluteSizeSpan(fontSizeInDp, true),
        startIndexOfPath,
        startIndexOfPath + path.length,
        0
    )
    spannable.setSpan(
        ForegroundColorSpan(Color.parseColor(colorCode)),
        startIndexOfPath,
        startIndexOfPath + path.length,
        0
    )
    return spannable
}

