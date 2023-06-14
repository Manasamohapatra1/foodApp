package com.example.onboarding_page

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Handler(Looper.getMainLooper()).postDelayed({
            if (onBoardingIsFinished()){
                findNavController().navigate(R.id.navigate_splashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.navigate_splashFragment_to_onBoardingFragment)}
        },2000)
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        return view
    }
    private fun onBoardingIsFinished():Boolean{
        val sharedPreferences= requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("next",false)
    }
}