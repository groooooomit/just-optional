package com.bfu.just.optional

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import just.optional.Optional

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Optional.ofNullable(null)
                .map {

                }
                .map {

                }
     }
}
