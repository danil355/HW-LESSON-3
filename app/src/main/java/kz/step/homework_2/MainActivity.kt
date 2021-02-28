package kz.step.homework_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var editLogin: EditText? = null
var editPassword: EditText? = null
var textView: TextView? = null
var buttonVissible: Button? = null
var buttonText: Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        editLogin = findViewById(R.id.login)
        editPassword = findViewById(R.id.password_toggle)
        textView = findViewById(R.id.textview)
        buttonVissible = findViewById(R.id.buttonVisible)
        buttonText = findViewById(R.id.buttonCheckText)
    }

    private fun initializeLiseners() {
        var visible: Boolean? = true

        var login: String = "icarus"
        var password: String = "fallen"


        buttonVissible?.setOnClickListener{
            if(visible == true)
            {

                editLogin?.visibility = View.INVISIBLE
                editPassword?.visibility = View.INVISIBLE
                textView?.visibility = View.INVISIBLE
                buttonText?.visibility = View.INVISIBLE
                visible = false
            }

            else{
                editLogin?.visibility = View.VISIBLE
                editPassword?.visibility = View.VISIBLE
                textView?.visibility = View.VISIBLE
                buttonText?.visibility = View.VISIBLE
                visible = true
            }
        }

        buttonText?.setOnClickListener {
            if(editLogin?.text?.toString() == login && editPassword?.text?.toString() == password)
            {
                textView?.text = "It is so sad =("
            }

            else{
                textView?.text = "Все норм!"
            }
        }
    }
}