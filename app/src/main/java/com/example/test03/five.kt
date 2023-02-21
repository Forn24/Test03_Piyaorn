package com.example.test03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.test03.one.Companion.s
import kotlinx.android.synthetic.main.activity_one.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        a.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@five, Score::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        b.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@five, Score::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
        c.setOnClickListener{
            s++
            val intent = Intent(this@five, Score::class.java)
            startActivity(intent)
        }

        d.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@five, Score::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}