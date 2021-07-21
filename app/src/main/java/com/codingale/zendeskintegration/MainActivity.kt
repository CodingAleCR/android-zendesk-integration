package com.codingale.zendeskintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingale.zendeskintegration.databinding.ActivityMainBinding
import zendesk.messaging.android.Messaging


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChat.setOnClickListener {
            Messaging.instance().showMessaging(this.applicationContext)
        }
    }
}