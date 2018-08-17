package com.example.seetha.myamazingviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

open class PageAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    override fun getCount(): Int {
        return 3 // Number of pages to show
    }

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> NewsFeedFragment.newInstance() //Page 0
                1 -> ProfilePageFragment.newInstance() //Page 1
                2 -> SettingsFragment.newInstance() //Page 2
                else -> PageFragment.newInstance(0, 0)
            }

    override fun getPageTitle(position: Int): CharSequence? =
            when (position) {
                0 -> "News Feed"
                1 -> "Profile"
                2 -> "Settings"
                else -> "Default page"
            }
}
