package com.shivaminteractive.flagquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shivaminteractive.flagquiz.databinding.FragmentHomeBinding
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper


class Fragment_Home : Fragment() {

    lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding= FragmentHomeBinding.inflate(inflater,container,false)

        createandOpendatabase()

        fragmentHomeBinding.startbtn.setOnClickListener {

            val direction= Fragment_HomeDirections.actionFragmentHomeToFragmentQuiz()
            this.findNavController().navigate(direction)

        }

        return fragmentHomeBinding.root
    }

    private fun createandOpendatabase()
    {
        try{
            val helper= DatabaseCopyHelper(requireContext())
            helper.createDataBase()
            helper.openDataBase()
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

}