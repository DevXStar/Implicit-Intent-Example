package com.example.implicitintentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Browser = findViewById<CardView>(R.id.Browser)
        val Camera = findViewById<CardView>(R.id.Camera)
        val Gallery = findViewById<CardView>(R.id.Gallery)
        val Phone = findViewById<CardView>(R.id.Phone)
        val Contacts = findViewById<CardView>(R.id.Contacts)


        Browser.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://google.com")
            startActivity(intent)
        }
        Camera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        Gallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivity(intent)
        }
        Phone.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        Contacts.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI)
            startActivity(intent)
        }
    }
}