package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.kotlindemo.model.User

class activity2 : AppCompatActivity() {
    var TAG=activity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        initViews()
    }

 fun initViews(){
     var textView=findViewById<TextView>(R.id.textView)

     var user=intent.getParcelableExtra<User>("user")
     Log.d(TAG,user.toString())
     textView.text=user.toString()
 }


}