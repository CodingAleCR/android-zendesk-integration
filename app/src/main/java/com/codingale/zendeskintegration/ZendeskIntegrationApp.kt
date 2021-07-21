package com.codingale.zendeskintegration


import android.app.Application
import android.util.Log
import zendesk.messaging.android.Messaging

/**
 * A sample [Application] with a [Messaging] integration in Kotlin.
 */
class ZendeskIntegrationApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Messaging.initialize(
            context = this,
            channelKey = "eyJzZXR0aW5nc191cmwiOiJodHRwczovL2NvZGluZ2FsZS56ZW5kZXNrLmNvbS9tb2JpbGVfc2RrX2FwaS9zZXR0aW5ncy8wMUZCMjY1WkMyN0VEWDQzSkdKWDk5QjJQWi5qc29uIn0=",
            successCallback = {
                Log.i("IntegrationApplication", "Initialization successful")
            },
            failureCallback = { cause ->
                Log.e("IntegrationApplication", "Initialization failed", cause)
            }
        )
    }
}
