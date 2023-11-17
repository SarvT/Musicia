package com.example.musicia

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabVPAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private var fragmentArrayList=ArrayList<Fragment>()
    private var fragmentNamesList=ArrayList<String>()
//    fragmentArrayList.add(fragment)
//    fragmentNamesList.add(title)
    override fun getCount(): Int {
        return fragmentArrayList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentArrayList.get(position)
    }

    public fun addFragments(fragment: Fragment, title:String){
        fragmentArrayList.add(fragment)
        fragmentNamesList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentNamesList.get(position)
    }
}