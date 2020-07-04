package com.vinayak.fragmentscommunication

import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapterViewModel(fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
     private val TAB_TITLES = listOf("First", "Second")
    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        return if (position == 0) {
            FirstFragmentViewModel.newInstance()
        } else {
            SecondFragmentViewModel.newInstance()
        }
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return (TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }

}