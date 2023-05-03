package eu.tutorials.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var EditTextNumber1: Number
    lateinit var EditTextNumber: Number
    lateinit var ButtonADDITION: Button
    lateinit var ButtonMULTIPLICATION: Button
    lateinit var ButtonSUBTRACTION: Button
    lateinit var ButtonDIVISION: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}