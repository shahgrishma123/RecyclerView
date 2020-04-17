package com.example.ktrecyclerviewep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL ,false)

        val users = ArrayList<User>()

        users.add(User("Grishma","India"))
        users.add(User("Trupti","India"))
        users.add(User("Sandip","India"))
        users.add(User("Trusit","USA"))
        users.add(User("Pooja","USA"))
        users.add(User("Vihar","Canada"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
