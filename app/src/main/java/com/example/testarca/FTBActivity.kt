package com.example.testarca

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FTBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ftb)

        val btnNext = findViewById<Button>(R.id.ftb_next)

        btnNext.setOnClickListener {
            /*  Intent is just like glue which helps to navigate one activity to another.   */
            val intent = Intent(baseContext, MainActivity::class.java)
            /*
            intent.putExtra("EXTRA_SESSION_ID", sessionId)
            intent2.putExtra("totalCA", "$labelTotalE")
            setResult(Activity.RESULT_OK, intent2)
            startActivityForResult(intent2 , MY_REQUEST_ID);
            finish()
            */
            startActivity(intent) // startActivity allow you to move
        }
    }
}
