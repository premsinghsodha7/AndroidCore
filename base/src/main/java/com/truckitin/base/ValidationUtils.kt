package com.truckitin.base

import android.util.Patterns
import java.util.regex.Pattern

const val USERNAME_REGEX = "^[\\\\p{L} .'-]+"

fun String?.isValidEmail() = Patterns.EMAIL_ADDRESS.matcher(this.toString()).matches()

fun String?.isNullOrEmpty(input: String?): Boolean = input == null || input.isEmpty()

fun isValidUsername(username: String?): Boolean {
    return Pattern.matches(USERNAME_REGEX, username.toString())
}
