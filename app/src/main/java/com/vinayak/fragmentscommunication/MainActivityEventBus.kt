package com.vinayak.fragmentscommunication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

/**
 * Activity in which Fragment communication takes place using EventBus.
 * @author jujare.vinayak
 */
class MainActivityEventBus:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_event_bus)
        var viewPagerAdapterInterface = ViewPagerEventBus(this,supportFragmentManager)
        var viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = viewPagerAdapterInterface
        var tabLayout: TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
    }
}