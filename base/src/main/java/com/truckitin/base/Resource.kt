package com.truckitin.base

import androidx.annotation.Keep

/**
 * this file has different states of our api calls status,
 * this acts as a mediator between ui layer and service layer throwing different events
 * on which state of ui is dependent
 * @param <T> is type of response
 */
sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    sealed class ResourceError : Resource<Nothing>() {
        data class GenericError(
            val error: ErrorResponse? = null
        ) : ResourceError()

        object NetworkError : ResourceError()
        object AuthExpiry : ResourceError()
    }
}

/**
 * @param message: a string message that we can show on a loader
 * @param isInProgress a string that tells whether to show or hide the progress
 */
@Keep
data class Loading(val message: String? = null, val isInProgress: Boolean = false)

/**
 * this is the error response model that backend is returning a
 * @param message a message explaining cause of error
 * @param result a string that has code i.e. result code
 * @param status whether response is success or failure
 */
@Keep
data class ErrorResponse(
    val message: String? = null,
    val result: String? = null,
    val status: Boolean = false,
    val code: String? = null
)

/**
 * this is an extension function that makes sure that we cover all branches in when block
 */
val <T> T.exhaustive: T get() = this
