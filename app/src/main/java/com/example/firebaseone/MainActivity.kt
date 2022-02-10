package com.example.firebaseone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.adapter.MyAdapter
import com.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter
    lateinit var staggered: StaggeredGridLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set up what this looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(
            applicationContext, 3,
            LinearLayoutManager.VERTICAL, false
        )
        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = gridLayoutManager
//        recyclerView.LinearLayoutManager=staggered
        recyclerView.setHasFixedSize(true)

// Set up the data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter



    }

    private fun setupData(): ArrayList<MyModel> {

        var items: ArrayList<MyModel> = ArrayList()
        items.add(MyModel(R.drawable.airplane, "Take a trip"))
        items.add(MyModel(R.drawable.biking, "Go for a bike ride"))
        items.add(MyModel(R.drawable.boardgames, "Play board games"))
        items.add(MyModel(R.drawable.cleaning, "Cleaning"))
        items.add(MyModel(R.drawable.cookdinner, "Make dinner"))
        items.add(MyModel(R.drawable.exercise, "Exercise / Health Club"))
        items.add(MyModel(R.drawable.finances, "Pay bills / finance stuff"))
        items.add(MyModel(R.drawable.games, "Athletic game"))
        items.add(MyModel(R.drawable.gardening, "Yard Work or Gardnering"))
        items.add(MyModel(R.drawable.golf, "Play golf"))
        items.add(MyModel(R.drawable.homework, "Do some homework"))
        items.add(MyModel(R.drawable.ironclothes, "Iron Clothes."))
        items.add(MyModel(R.drawable.meeting, "Take a trip."))
        items.add(MyModel(R.drawable.movie, "Watch a movie."))
        items.add(MyModel(R.drawable.mowlawn, "Mow the lawn"))
        items.add(MyModel(R.drawable.movieorevent, "Take a trip."))
        items.add(MyModel(R.drawable.napping, "Take a nap."))
        items.add(MyModel(R.drawable.oilchange, "Car oil change or repair"))
        items.add(MyModel(R.drawable.organized, "Get organized."))
        items.add(MyModel(R.drawable.party, "Go to or have a party."))
        items.add(MyModel(R.drawable.phonecall, "Make some calls."))
        items.add(MyModel(R.drawable.picnic, "Go on a picnic"))
        items.add(MyModel(R.drawable.relax, "Just relax / rest"))
        items.add(MyModel(R.drawable.repairwork, "Fix something."))
        items.add(MyModel(R.drawable.roadtrip, "Road trip"))
        items.add(MyModel(R.drawable.running, "Go for a run."))
        items.add(MyModel(R.drawable.shopping, "Go shopping"))
        items.add(MyModel(R.drawable.walking, "Go for a walk"))
        items.add(MyModel(R.drawable.washclothes, "Wash clothes"))
        items.add(MyModel(R.drawable.washdishes, "Wash dishes"))
        items.add(MyModel(R.drawable.watchtv, "Watch TV"))

    return items
    }
}

