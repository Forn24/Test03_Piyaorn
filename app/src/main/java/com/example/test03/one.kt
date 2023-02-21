package com.example.test03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {

    companion object{
        var s = 5
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        a.setOnClickListener{
            s++
            val intent = Intent(this@one, two::class.java)
            startActivity(intent)
        }

        b.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        c.setOnClickListener{
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@one, two::class.java)
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
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}