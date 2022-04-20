package com.rafdi.mbuh.ui.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import rafdi.mbuh.R


class Page2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_page2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ivFirstPage = view.findViewById<ImageView>(R.id.iv_second_page)

        Glide.with(view)
            .load(getString(R.string.url_landing_page2))
            .into(ivFirstPage)
    }
}
