package com.liubao.network

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NetworkActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_network)
    findViewById<TextView>(R.id.text).apply {
      setOnClickListener {
        supportFragmentManager.beginTransaction().add(
          R.id.frameLayout,
          NetworkFragment()
        )
      }
    }

  }

}