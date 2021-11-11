package com.truckitin.base

/**
 * @param unit is invoked when the list is not null and it has some items in it
 *
 */
fun <T> List<T>?.NAE(unit: (List<T>) -> Unit) {
    if (this != null && this.isNotEmpty()) {
        unit.invoke(this)
    }
}
