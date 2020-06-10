package com.softartdev.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softartdev.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text_view.text = createApplicationScreenMessage()
    }
}
