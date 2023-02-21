package com.example.test03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var a: String
        var b: String
        var oldNum = 0
        var NewOp = true
        var op = "+"

        num0.setOnClickListener {
            b = "0"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num1.setOnClickListener {
            b = "1"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num2.setOnClickListener {
            b = "2"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num3.setOnClickListener {
            b = "3"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num4.setOnClickListener {
            b = "4"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num5.setOnClickListener {
            b = "5"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num6.setOnClickListener {
            b = "6"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num7.setOnClickListener {
            b = "7"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num8.setOnClickListener {
            b = "8"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        num9.setOnClickListener {
            b = "9"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(b)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                a = textshow.text.toString().plus(b)
                textshow.setText(a)
            }
        }

        clear.setOnClickListener {
            textshow.setText("0")
        }

        delete.setOnClickListener {
            if (textshow.text.length != 1) {
                a = textshow.text.toString().dropLast(1)
                textshow.setText(a)
            } else {
                a = "0"
                textshow.setText(a)
            }
        }

        plus.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNum = num
            op = "+"
            a = "0"
        }

        minus.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNum = num
            op = "-"
            a = "0"
        }

        multiply.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNum = num
            op = "*"
            a = "0"
        }

        divide.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNum = num
            op = "/"
            a = "0"
        }

        mod.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNum = num
            op = "%"
            a = "0"
        }

        equal.setOnClickListener {
            var new:String = textshow.text.toString()
            var result = 0
            if (op == "+") {
                result = oldNum + new.toInt()
                textshow.setText(result.toString())
            } else if (op == "-") {
                result = oldNum - new.toInt()
                textshow.setText(result.toString())
            } else if (op == "*") {
                result = oldNum * new.toInt()
                textshow.setText(result.toString())
            } else if (op == "/") {
                if (new == "0") {
                    textshow.setText("Can't divide by zero")
                } else {
                    result = oldNum / new.toInt()
                    textshow.setText(result.toString())
                }
            } else if (op == "%") {
                if (new == "0") {
                    textshow.setText("Can't mod by zero")
                } else {
                    result = oldNum % new.toInt()
                    textshow.setText(result.toString())
                }
            }
        }
    }
}