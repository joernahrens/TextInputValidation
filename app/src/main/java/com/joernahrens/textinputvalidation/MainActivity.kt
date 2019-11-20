package com.joernahrens.textinputvalidation

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.editText
import kotlinx.android.synthetic.main.activity_main.textInput

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    editText.addTextChangedListener(object : TextWatcher {
      override fun afterTextChanged(p0: Editable?) {
      }

      override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
      }

      override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        if (p0?.length != 0) textInput.error =
            "Some error, quite lengthy, because the use really has to know what's going on here"
        else textInput.error = null
      }
    })
  }
}
