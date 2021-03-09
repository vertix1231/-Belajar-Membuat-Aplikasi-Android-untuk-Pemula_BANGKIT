package com.dicoding.bangkit.android.fundamental.carshowcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class About : AppCompatActivity() {


    private lateinit var fotogwabout : CircleImageView
    private lateinit var namaaboutgw : TextView
    private lateinit var emailaboutgw :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        fotogwabout = findViewById(R.id.cvAboutGw)
        namaaboutgw = findViewById(R.id.tv_Aboutnamagw)
        emailaboutgw = findViewById(R.id.tvAboutEmailGw)


    }
}