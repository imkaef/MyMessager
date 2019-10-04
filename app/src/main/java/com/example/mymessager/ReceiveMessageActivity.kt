package com.example.mymessager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_receive_message.*

class ReceiveMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

//    var intent = getIntent()
//        message.setText(intent.extras.getString("Message")) //Это работает и то что ниже работает
//        message.setText(intent.getStringExtra(CreateMessageActivity.EXTRA_MESSAGE))// Через переменную сс было сделаное
    }
}
