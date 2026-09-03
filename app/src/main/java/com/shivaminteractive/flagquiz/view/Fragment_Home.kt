package com.shivaminteractive.flagquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shivaminteractive.flagquiz.R
import com.shivaminteractive.flagquiz.databinding.FragmentHomeBinding


class Fragment_Home : Fragment() {

    lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding= FragmentHomeBinding.inflate(inflater,container,false)

        fragmentHomeBinding.startbtn.setOnClickListener {
            

        }

        return fragmentHomeBinding.root
    }

}