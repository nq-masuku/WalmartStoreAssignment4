package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.walmartstore.data.User
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun create(view: View) {
        var user= User(fnamev.text.toString(), lname.text.toString(), emailV.text.toString(), passwordv.text.toString())
        Toast.makeText(this, "Account created successfully.", Toast.LENGTH_LONG).show()
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("newUser",user)
        startActivity(intent)
    }
}