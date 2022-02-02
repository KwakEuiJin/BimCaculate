package com.example.aop_chapter01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et_height: EditText = findViewById(R.id.et_height)
        val et_weight = findViewById<EditText>(R.id.et_weight)
        val bt_ok = findViewById<Button>(R.id.bt_ok)

        bt_ok.setOnClickListener{
            Log.d("MainActivity","버튼이 클릭되었습니다." )
            if (et_height.text.isEmpty()|| et_weight.text.isEmpty()){
                Toast.makeText(this, "빈 값이 있습니다",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val height =  et_height.text.toString().toInt()
            val weight = et_weight.text.toString().toInt()

            Log.d("MainActivity","height = $height weight = $weight")
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("height",height)
            intent.putExtra("weight",weight)
            startActivity(intent)
        }



    }
}