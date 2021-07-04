package com.crimsoft.guidebrigespb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_title, container, false)

       val mAdView:AdView = view.findViewById(R.id.adView1)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        return view
    }


}