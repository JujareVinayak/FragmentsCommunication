package com.vinayak.fragmentscommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

/**
 * Activity in which Fragment communication takes place using Interface.
 * @author jujare.vinayak
 */
class MainActivityInterface : AppCompatActivity(),FirstFragmentInterface.OnFragmentCommunicationListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_interface)
        var viewPagerAdapterInterface = ViewPagerAdapterInterface(this,supportFragmentManager)
        var viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = viewPagerAdapterInterface
        var tabLayout:TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onEmailChange(email: String?) {
        var tag = "android:switcher:${R.id.view_pager}:1"
        var secondFragment:SecondFragmentInterface = supportFragmentManager.findFragmentByTag(tag) as SecondFragmentInterface
            secondFragment.onEmailChange(email)

    }

    override fun onNameChange(name: String?) {
        var tag = "android:switcher:${R.id.view_pager}:1"
        var secondFragment:SecondFragmentInterface = supportFragmentManager.findFragmentByTag(tag) as SecondFragmentInterface
            secondFragment.onNameChange(name)
    }


}
