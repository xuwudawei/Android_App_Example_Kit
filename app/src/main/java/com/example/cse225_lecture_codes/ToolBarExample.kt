package com.example.cse225_lecture_codes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class ToolBarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_example)
        var toolbar=findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle("Toolbar Example")

        toolbar.setLogo(R.drawable.logo_toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener{
            Toast.makeText(this,"Back Arrow",Toast.LENGTH_SHORT).show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id:Int=item.itemId
        if(id==R.id.action_settings){
            Toast.makeText(applicationContext,"Settings",Toast.LENGTH_SHORT).show()
            return true
        }
        else if(id==R.id.action_email){
            Toast.makeText(applicationContext,"Logout",Toast.LENGTH_SHORT).show()
            return true
        }
        else if(id==R.id.action_add){
            Toast.makeText(applicationContext,"More...",Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}