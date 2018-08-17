package com.example.seetha.myamazingviewpager

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // Get ViewPager from layout
        // Set PageAdapter as adapter for viewpager
        activity_main_viewpager.adapter = PageAdapter(supportFragmentManager, resources.getIntArray(R.array.colorPagesViewPager))

    }


}
