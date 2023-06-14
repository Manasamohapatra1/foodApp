package com.example.onboarding_page.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.onboarding_page.R


class SecondScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_second_screen, container, false)

        val next =view.findViewById<Button>(R.id.nextbtn)
        val back= view.findViewById<Button>(R.id.backbtn)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.view_pager)

        next.setOnClickListener{
            viewPager?.currentItem= 2
        }
        back.setOnClickListener{
            viewPager?.currentItem=0
        }
        return view
    }


}