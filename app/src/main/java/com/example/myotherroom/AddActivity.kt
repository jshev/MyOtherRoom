package com.example.myotherroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    lateinit var repo:StudentsRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        repo = StudentsRepository(this)

        insertButton.setOnClickListener() {
            var first:String = firstnameET.text.toString()
            var last:String = lastnameET.text.toString()

            if (first != "" && last != "") {
                repo.insertStudent(Students(null, first, last))
                firstnameET.text.clear()
                lastnameET.text.clear()
            }
        }

        mainButton.setOnClickListener(){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}