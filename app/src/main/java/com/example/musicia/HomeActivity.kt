package com.example.musicia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


//        val recyclerView = findViewById<RecyclerView>(R.id.listRecyclerView)
//        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
//        val dataset = arrayOf("January", "February", "March")
//        recyclerView.layoutManager=staggeredGridLayoutManager
//        val listViewAdapter = ListViewAdapter(dataset)
//        recyclerView.adapter=listViewAdapter

        val tabLayout:TabLayout=findViewById(R.id.home_tab_layout)
        val viewPager:ViewPager= findViewById(R.id.home_view_pager)

        tabLayout.setupWithViewPager(viewPager)
        val tabVpAdapter = TabVPAdapter(supportFragmentManager)
        tabVpAdapter.addFragments(HomeFragment(), "Home")
        tabVpAdapter.addFragments(StatusFragment(), "Status")
        tabVpAdapter.addFragments(OptionFragment(), "Option")
        viewPager.adapter = tabVpAdapter
    }

}