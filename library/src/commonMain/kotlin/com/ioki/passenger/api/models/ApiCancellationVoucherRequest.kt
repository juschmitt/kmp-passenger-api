package com.ioki.passenger.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class ApiCancellationVoucherRequest(
    @SerialName(value = "ride_version") val rideVersion: Int,
)
