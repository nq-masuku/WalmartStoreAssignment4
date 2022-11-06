package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping.*

class Shopping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        var intentVar = intent
        textView.text = "Welcome "+ intentVar.getStringExtra("username")
    }

    fun food(view: View) {
        Toast.makeText(this, "You have chosen the food category of shopping.", Toast.LENGTH_LONG).show()
    }

    fun electronics(view: View) {
        startActivity(Intent(this, ElectronicsItem::class.java))
    }

    fun beauty(view: View) {
        Toast.makeText(this, "You have chosen the beauty category of shopping.", Toast.LENGTH_LONG).show()
    }

    fun clothing(view: View) {
        Toast.makeText(this, "You have chosen the clothing category of shopping.", Toast.LENGTH_LONG).show()
    }
}