package com.example.seetha.myamazingviewpager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // Get ViewPager from layout
        val pager = findViewById<ViewPager>(R.id.activity_main_viewpager)

        // Set PageAdapter as adapter for viewpager
        pager.adapter = PageAdapter(supportFragmentManager)

        // Get Tablayout and set up with the viewpager
        activity_main_tabs.setupWithViewPager(pager)

        // Enable tabs to have the same width
        activity_main_tabs.tabMode = TabLayout.MODE_FIXED

    }

}
