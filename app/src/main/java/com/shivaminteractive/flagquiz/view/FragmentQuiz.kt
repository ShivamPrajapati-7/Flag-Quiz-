package com.shivaminteractive.flagquiz.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shivaminteractive.flagquiz.R
import com.shivaminteractive.flagquiz.database.flagsdao
import com.shivaminteractive.flagquiz.databinding.FragmentHomeBinding
import com.shivaminteractive.flagquiz.databinding.FragmentQuizBinding
import com.shivaminteractive.flagquiz.model.flagsmodel
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper

class FragmentQuiz : Fragment() {
    lateinit var fragmentQuizBinding: FragmentQuizBinding
    var flaglist= ArrayList<flagsmodel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentQuizBinding= FragmentQuizBinding.inflate(inflater,container,false)

         val dao= flagsdao()
        flaglist=dao.getrandomrecords(DatabaseCopyHelper(requireContext()))
        for(flag in flaglist)
        {
            Log.d("flags",flag.flag_id.toString())
            Log.d("flags",flag.country_name.toString())
            Log.d("flags",flag.flag_name.toString())
            Log.d("flags","***************************")
        }

        fragmentQuizBinding.optionA.setOnClickListener{

        }
        fragmentQuizBinding.optionB.setOnClickListener{

        }
        fragmentQuizBinding.optionC.setOnClickListener{

        }
        fragmentQuizBinding.optionD.setOnClickListener{
            
        }


        return fragmentQuizBinding.root
    }
}