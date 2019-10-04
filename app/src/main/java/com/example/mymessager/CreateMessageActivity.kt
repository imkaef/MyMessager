package com.example.mymessager

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_message.*
import kotlinx.android.synthetic.main.activity_create_message.view.*


class CreateMessageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
        send.setOnClickListener {


        /* val intent = Intent(this, ReceiveMessageActivity::class.java)//явний интент
         intent.putExtra(EXTRA_MESSAGE ,message.text.toString())*/ //ерез переменную сс спользую ехстра месаж
//         val intent = Intent(Intent.ACTION_SEND)//не явный интент для отправки сообщения
            var intent = Intent(Intent.ACTION_SEND)
         intent.setType("text/plain")
         intent.putExtra(Intent.EXTRA_TEXT,message.text.toString())
            val putExtra = intent.putExtra(Intent.EXTRA_SUBJECT, "TEst ne yvniy intent")
            intent = Intent.createChooser(intent,"CHOISER@")
            startActivity(intent)
         /*   val chosenIntent = Intent.createChooser(intent,"CHOISER")
         startActivity(chosenIntent)*/
     }   //119
    }
    /*companion object{
        const val EXTRA_MESSAGE = "Message"
    }*/
}
