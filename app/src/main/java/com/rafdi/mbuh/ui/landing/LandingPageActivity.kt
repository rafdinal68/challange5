package com.rafdi.mbuh.ui.landing


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import rafdi.mbuh.R

class LandingPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        val viewPager: ViewPager2 = findViewById(R.id.viewpager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            Page1Fragment(),
            Page2Fragment(),
            Page3Fragment()
        )

        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter
        val wormDotsIndicator = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)
        wormDotsIndicator.setViewPager2(viewPager)

    }
}