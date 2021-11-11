package com.truckitin.base

/**
 * @param calls the block if data is non null and True
 */
fun Boolean?.NAT(nonNull: (Boolean) -> Unit) {
    this?.let {
        if (it)
            nonNull.invoke(this)
    }
}