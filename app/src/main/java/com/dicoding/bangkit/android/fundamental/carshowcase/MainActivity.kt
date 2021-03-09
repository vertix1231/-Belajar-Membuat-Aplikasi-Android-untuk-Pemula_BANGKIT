package com.dicoding.bangkit.android.fundamental.carshowcase

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  rvcar : RecyclerView
    private var list : ArrayList<Car> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvcar = findViewById(R.id.rv_car)
        rvcar.setHasFixedSize(true)
        list.addAll(CarData.listcar)
        showRecyclerView()
    }
    private fun showRecyclerView(){
        rvcar.layoutManager = LinearLayoutManager(this)
        val caradapter = CarAdapter(list)
        rvcar.adapter = caradapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.menu_home -> {
                true
            }
            R.id.menu_about -> {
                val moveabout = Intent(this@MainActivity,About::class.java)
                startActivity(moveabout)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}