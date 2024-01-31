package edu.uw.ischool.jsaleh1.biggobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Random

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushMeButton = findViewById<Button>(R.id.pushMe)
        pushMeButton.setOnClickListener {
            count++
            if(count == 1) {
                pushMeButton.text = "You have pushed me ${count} time!"
            } else {
                pushMeButton.text = "You have pushed me ${count} times!"
            }
            val rnd = Random()
            val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            val color2 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            pushMeButton.setBackgroundColor(color)
            pushMeButton.setTextColor(color2)
        }
    }

    fun increaseCount(count : Int) {

    }
}