package com.example.test03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.test03.one.Companion.s
import kotlinx.android.synthetic.main.activity_one.*

class three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        a.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        b.setOnClickListener{
            s++
            val intent = Intent(this@three, four::class.java)
            startActivity(intent)
        }

        c.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        d.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}