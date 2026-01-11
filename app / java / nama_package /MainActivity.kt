package com.example.p3_ui_logic_nim

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()

            if (name.isEmpty()) {
                etName.error = "Nama tidak boleh kosong"
            } else {
                tvResult.text = "Halo, $name! 🎉"
                Toast.makeText(this, "Data berhasil diproses", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
