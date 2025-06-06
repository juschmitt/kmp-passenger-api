package com.ioki.passenger.api.models

import kotlin.test.Test

internal class ApiStripeSetupIntentResponseTest : IokiApiModelTest() {
    @Test
    fun serialization() {
        testJsonStringCanBeConvertedToModel(
            ApiStripeSetupIntentResponse("secret"),
            stripeSetupIntent,
        )
    }
}

private val stripeSetupIntent =
    """
{
  "client_secret": "secret"
}
"""
