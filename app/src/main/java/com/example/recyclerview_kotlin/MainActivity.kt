package com.example.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv=findViewById<RecyclerView>(R.id.rv)
        val MovieObject= mutableListOf<Movies>()
        MovieObject.add(Movies("Titanic","Kate W"))
        MovieObject.add(Movies("Wild","Reese Witherspoon"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        MovieObject.add(Movies("Erin Brockowhich","Julia Roberts"))
        rv.adapter=MyAdapter(MovieObject)
        rv.layoutManager=LinearLayoutManager(this)

    }
}