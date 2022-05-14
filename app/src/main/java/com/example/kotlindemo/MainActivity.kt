package com.example.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kotlindemo.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


   fun initViews(){
       var b_openLayer=findViewById<Button>(R.id.b_openLayer)
       b_openLayer.setOnClickListener {
           var user=User(name ="Shaxzod", age =20)
            intentFun(user)
       }
   }

    fun intentFun(user: User){
        val intent= Intent(this,activity2::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }


}