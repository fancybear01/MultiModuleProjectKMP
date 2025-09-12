package com.coding.commom.utils

actual object ThreadUtils {
    actual var getThreadName: () -> String = { Thread.currentThread().name }
}