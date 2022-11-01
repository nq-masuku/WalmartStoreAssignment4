package com.example.walmartstore

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
                Toast.makeText(this, "Welcome, ${user.firstname}  ${user.lastname}.", Toast.LENGTH_LONG).show()
                break
            }
        }
        if(!found){
            Toast.makeText(this, "Incorrect credentials entered", Toast.LENGTH_LONG).show()
        }
    }
}