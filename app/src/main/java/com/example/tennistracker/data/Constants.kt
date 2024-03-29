package com.example.tennistracker.data

import android.Manifest
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.S)
object Constants {
    const val APP_TOAST_BLUETOOTH_NOT_AVAILABLE = "Bluetooth isn't available."
    const val APP_TOAST_BLUETOOTH_DATA_SENDING_NOT_AVAILABLE = "No data can be sent to physical device."
    const val APP_TOAST_BLUETOOTH_DEVICE_NOT_FOUND = "No valid device was found."
    const val APP_TOAST_BLUETOOTH_DEVICE_CONNECTION_SUCCESSFUL = "Successful connection!"
    const val APP_TOAST_BLUETOOTH_DEVICE_CONNECTION_FAILED = "Failed to connect to the device."
    const val APP_TEXT_LAST_HIT_SPEED = "Last hit speed:"

    const val APP_DEVICE_BLUETOOTH_ADDRESS = "00:20:10:08:0B:EF"

    const val APP_TENNIS_MAX_STRENGTH = 120
    const val APP_TENNIS_MAX_SPEED = 200
    const val APP_TENNIS_MAX_RADIAN = 270

    const val APP_DATA_BYTE_AMOUNT = 3+1
    const val APP_DATA_RECEPTION_PERIOD = 100L

    val APP_STATISTICS_DEFAULT_LIST = listOf(
        TennisHit(speed = 60F, strength = 30F, radian = 135F),
        TennisHit(speed = 50F, strength = 37F, radian = 129F),
        TennisHit(speed = 140F, strength = 90F, radian = 179F),
        TennisHit(speed = 160F, strength = 110F, radian = 165F),
        TennisHit(speed = 155F, strength = 105F, radian = 181F)
    )

    val APP_BLUETOOTH_PERMISSIONS_LIST = listOf(
        Manifest.permission.BLUETOOTH_SCAN,
        Manifest.permission.BLUETOOTH_CONNECT,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION
    )
}