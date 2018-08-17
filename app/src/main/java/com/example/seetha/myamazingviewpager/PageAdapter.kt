package com.example.seetha.myamazingviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

open class PageAdapter(manager: FragmentManager,
                       private val colors: IntArray) : FragmentPagerAdapter(manager) {

    override fun getCount(): Int {
        return colors.size // Number of pages to show
    }

    override fun getItem(position: Int): Fragment {
        //Page to return
        return PageFragment.newInstance(position, this.colors[position])
    }
}
