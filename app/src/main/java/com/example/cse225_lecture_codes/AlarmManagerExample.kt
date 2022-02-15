package com.example.cse225_lecture_codes

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.NumberFormatException

class AlarmManagerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_manager_example)
        var start =findViewById<Button>(R.id.button)
        var Rstart=findViewById<Button>(R.id.RStart)
        var cancel=findViewById<Button>(R.id.cancel_button)
        var Etext=findViewById<EditText>(R.id.time)
        var alarmManager:AlarmManager
        val intent=Intent(this,AlarmManagerBroadcast::class.java)
        val pendingIntent=PendingIntent.getBroadcast(this,234,intent,PendingIntent.FLAG_IMMUTABLE)

        start.setOnClickListener {

            try{
                var i = Etext.text.toString().toInt()
                alarmManager=getSystemService(Context.ALARM_SERVICE) as AlarmManager
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pendingIntent)
                Toast.makeText(this,"Alarm set in $i seconds",Toast.LENGTH_LONG).show()
            } catch(e:NumberFormatException){
            // handle your exception
                print(e)
            }

        }

        Rstart.setOnClickListener {

            alarmManager=getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),3000,pendingIntent)
            Toast.makeText(this,"Repeating Alarm 3 seconds",Toast.LENGTH_LONG).show()
        }


        cancel.setOnClickListener {
            alarmManager=getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm Cancelled",Toast.LENGTH_LONG).show()
        }



    }
}