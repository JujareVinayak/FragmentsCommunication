package com.vinayak.fragmentscommunication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

/**
 * Activity in which Fragment communication takes place using RxJava.
 * @author jujare.vinayak
 */
class MainActivityRxJava:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rxjava)
        var viewPagerAdapterRxJava = ViewPagerAdapterRxJava(supportFragmentManager)
        var viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = viewPagerAdapterRxJava
        var tabLayout: TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
    }
}