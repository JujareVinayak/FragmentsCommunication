package com.vinayak.fragmentscommunication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

/**
 * Activity in which Fragment communication takes place using ViewModel.
 * @author jujare.vinayak
 */
class MainActivityViewModel : AppCompatActivity() {

    lateinit var buttonInterface:Button
    lateinit var buttonRxJava:Button
    lateinit var buttonEventBus:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonInterface = findViewById(R.id.btn_interface)
        buttonRxJava = findViewById(R.id.btn_rx_java)
        buttonEventBus = findViewById(R.id.btn_event_bus)
        val viewPagerAdapter = ViewPagerAdapterViewModel(supportFragmentManager)
        val viewPager:ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = viewPagerAdapter
        val tabLayout:TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
    }

    fun launchInterfaceActivity(view: View) {
        var intent = Intent(this,MainActivityInterface::class.java)
        startActivity(intent)
    }

    fun launchRxJavaActivity(view: View) {
        var intent = Intent(this,MainActivityRxJava::class.java)
        startActivity(intent)
    }

    fun launchEventBusActivity(view: View) {
        var intent = Intent(this,MainActivityEventBus::class.java)
        startActivity(intent)
    }
}
