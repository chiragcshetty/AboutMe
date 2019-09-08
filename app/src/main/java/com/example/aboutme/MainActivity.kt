package com.example.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.ContextMenu
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
        /*
        val buttonIn = findViewById<Button>(R.id.done_button)
        buttonIn.setOnClickListener {
            addNickname(it)
            //buttonIn.gravity = Gravity.TOP

        }
        */
    }

    private fun addNickname(view: View) {


        binding.nicknameText.text = binding.nicknameEdit.text
        binding.invalidateAll()
        binding.nicknameEdit.visibility = View.GONE
        //view.visibility = View.GONE
        binding.doneButton.visibility = View.GONE
        binding.nicknameText.textAlignment = View.TEXT_ALIGNMENT_CENTER
        binding.nicknameText.visibility = View.VISIBLE

        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

/*
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val buttonIn = findViewById<Button>(R.id.done_button)
    buttonIn.setOnClickListener {
        addNickname(it)
        //buttonIn.gravity = Gravity.TOP

    }
}

private fun addNickname(view: View) {

    val editText = findViewById<EditText>(R.id.nickname_edit)
    val nicknameTXT = findViewById<TextView>(R.id.nickname_text)

    nicknameTXT.text = editText.text
    editText.visibility = View.GONE
    view.visibility = View.GONE
    nicknameTXT.textAlignment = View.TEXT_ALIGNMENT_CENTER
    nicknameTXT.visibility = View.VISIBLE

    val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}
*/