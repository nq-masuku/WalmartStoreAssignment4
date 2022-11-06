package com.example.walmartstore

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.walmartstore.data.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arrayList: ArrayList<User> =  arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intentReceiver = intent
        if(intentReceiver.getSerializableExtra("newUser") != null) {
            var newUser = intentReceiver.getSerializableExtra("newUser") as User
            arrayList.add(newUser)
        }


        arrayList.add(User("Nqobane","Masuku","nqoba@gmail.com","nqoba"))
        arrayList.add(User("Sizwe","Dlomo","sizwe@gmail.com","sizwe"))
        arrayList.add(User("Megan","Curtis","megan@gmail.com","megan"))
        arrayList.add(User("James","Laga","james@gmail.com","james"))
    }

    fun authenticate(view: View) {
        var found: Boolean = false;
        for(user in arrayList){
            if(user.username.equals(editTextEmail.text.toString()) &&
                user.password.equals(editTextPassword.text.toString())){
                found = true
                var intent = Intent(this, Shopping::class.java)
                intent.putExtra("username",user.username)
                startActivity(intent)
            }
        }
        if(!found){
            Toast.makeText(this, "Incorrect credentials entered", Toast.LENGTH_LONG).show()
        }
    }

    fun create(view: View) {
        var intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun reset(view: View) {
        for(user in arrayList){
            if(user.username.equals(editTextEmail.text.toString())){
                val intent = Intent()
                intent.data = Uri.parse("mailto:");
                intent.putExtra(Intent.EXTRA_EMAIL, user.username);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Your password");
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent);
                }
                }
        }
    }
}