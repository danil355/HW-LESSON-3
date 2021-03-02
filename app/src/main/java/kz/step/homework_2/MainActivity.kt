package kz.step.homework_2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

var editTextViewLogin: EditText? = null
var editTextViewPassword: EditText? = null
var textViewResult: TextView? = null
var buttonVisibleInViews: Button? = null
var buttonReadText: Button? = null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        editTextViewLogin = findViewById(R.id.login)
        editTextViewPassword = findViewById(R.id.password_toggle)
        textViewResult = findViewById(R.id.textview_result)
        buttonVisibleInViews = findViewById(R.id.button_visible_in_views)
        buttonReadText = findViewById(R.id.button_CheckText)
    }

    private fun initializeLiseners() {
        var visible: Boolean? = true

        var login: String = "icarus"
        var password: String = "fallen"


        buttonVisibleInViews?.setOnClickListener{
            if(visible == true)
            {

                editTextViewLogin?.visibility = View.INVISIBLE
                editTextViewPassword?.visibility = View.INVISIBLE
                textViewResult?.visibility = View.INVISIBLE
                buttonReadText?.visibility = View.INVISIBLE
                visible = false
            }

            else{
                editTextViewLogin?.visibility = View.VISIBLE
                editTextViewPassword?.visibility = View.VISIBLE
                textViewResult?.visibility = View.VISIBLE
                buttonReadText?.visibility = View.VISIBLE
                visible = true
            }
        }

        buttonReadText?.setOnClickListener {
            if(editTextViewLogin?.text?.toString() == login && editTextViewPassword?.text?.toString() == password)
            {
                textViewResult?.text = "It is so sad =("
            }

            else{
                textViewResult?.text = "Все норм!"
            }
        }
    }

}