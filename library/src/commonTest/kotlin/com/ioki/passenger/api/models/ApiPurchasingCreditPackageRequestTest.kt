package com.ioki.passenger.api.models

import kotlin.test.Test

internal class ApiPurchasingCreditPackageRequestTest : IokiApiModelTest() {
    @Test
    fun serializationMinimal() {
        testJsonStringCanBeConvertedToModel(
            ApiPurchasingCreditPackageRequest(
                cost = 800,
                value = 1000,
                paymentMethod = ApiPaymentMethodRequest(
                    paymentMethodType = ApiPaymentMethodType.STRIPE,
                    id = null,
                ),
                paypalSecureElement = null,
            ),
            purchasingCreditPackageMinimal,
        )
    }

    @Test
    fun serialization() {
        testJsonStringCanBeConvertedToModel(
            ApiPurchasingCreditPackageRequest(
                cost = 800,
                value = 1000,
                paymentMethod = ApiPaymentMethodRequest(
                    paymentMethodType = ApiPaymentMethodType.STRIPE,
                    id = null,
                ),
                paypalSecureElement = "secure_element",
            ),
            purchasingCreditPackage,
        )
    }
}

private val purchasingCreditPackageMinimal =
    """
{
  "cost": 800,
  "value": 1000,
  "payment_method": {
    "payment_method_type": "stripe"
  }
}
"""

private val purchasingCreditPackage =
    """
{
  "cost": 800,
  "value": 1000,
  "payment_method": {
    "payment_method_type": "stripe"
  },
  "paypal_secure_element": "secure_element"
}
"""
