package com.example.whatsappnumberfinderandchat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<EditText>(R.id.input1)
        val inp = findViewById<EditText>(R.id.input2)
        val clr = findViewById<Button>(R.id.clear)
        val btn = findViewById<Button>(R.id.btn)
        val v = "https://wa.me/91"
        val z = "?text="
        val c = findViewById<TextView>(R.id.txt)
        val d = c.getText().toString()+""+a.getText().toString()
        btn.setOnClickListener{
            c.setText(v.toString())
            c.setText(c.getText().toString()+""+a.getText().toString()+""+z.toString()+""+inp.getText().toString())
            val dd = c.getText().toString()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(dd)
            startActivity(intent)
            a.setText("")
        }
        clr.setOnClickListener{
            c.setText("")
            a.setText("")

        }
    }
}
