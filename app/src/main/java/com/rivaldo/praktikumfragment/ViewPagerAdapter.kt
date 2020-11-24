package com.rivaldo.praktikumfragment

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        //menentukan jumlah tab
        return 3
    }

    override fun getItem(position: Int): Fragment {
        // untuk mengatur fragment yang dipanggil berdasarkan urutan tab
        return when(position){
            0 -> FirstFragment.newInstance()
            1 -> SecondFragment.newInstance()
            2 -> LastFragment.newInstance()
            else -> FirstFragment.newInstance()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        //untuk mendapatkan judul halaman atau fragment
        return mContext.resources.getString(TAB_TITLES[position])
    }

    companion object{
        @StringRes
        //array judul halaman
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3)
    }
}