package com.gamecodeschool.recyclerview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*



        recyclerView_main.adapter = MainAdapter()data class Names(val name: String, val age: Int, val hobby: String, val dob:String)

        class MainActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                rvNames.layoutManager = LinearLayoutManager(baseContext)
                val namesAdapter = NamesRecyclerViewAdapter(listOf("Michelle", "Jay", "Jakes", "Brian", "Latifah", "Ryan", "Carol", "Brenda", "Anne", "Rose"))
                rvNames.adapter = namesAdapter
                val namesAdapter = NamesRecyclerViewAdapter(namesList = listOf(
                    Names("Michelle",20,"Swimming","8/8/2000"),
                    Names("Jay",15,"Skating","6/5/2000"),
                    Names("Jakes",56,"Driving","9/8/1999"),
                    Names("Brian",43,"Singing","9/4/1995"),
                    Names("Latifah",23,"Dancing","17/9/2007"),
                    Names("Ryan",18,"Skipping","17/9/1996"),
                    Names("Carol",36,"Preaching","6/6/1992"),
                    Names("Brenda",17,"Teaching","3/6/1992"),
                    Names("Anne",26,"Crying","5/9/2003"),
                    Names("Rose",28,"Playing","15/7/1993")

                )
                        rvNames.adapter = namesAdapter
            }
        }
