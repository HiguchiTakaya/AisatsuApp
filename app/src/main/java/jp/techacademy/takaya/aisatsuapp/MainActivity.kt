package jp.techacademy.takaya.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                when(hour) {
                    2,3,4,5,6,7,8,9 -> textView.text = "おはよう"
                    10,11,12,13,14,15,16,17 -> textView.text = "こんにちわ"
                    18,19,20,21,22,23,24,1 -> textView.text = "こんばんわ"
                }
            },
            13, 0, true
        )
        timePickerDialog.show()
    }
}
