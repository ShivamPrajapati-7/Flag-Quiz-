package com.shivaminteractive.flagquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shivaminteractive.flagquiz.R
import com.shivaminteractive.flagquiz.databinding.FragmentHomeBinding
import com.shivaminteractive.flagquiz.databinding.FragmentQuizBinding

class FragmentQuiz : Fragment() {
    lateinit var fragmentQuizBinding: FragmentQuizBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentQuizBinding= FragmentQuizBinding.inflate(inflater,container,false)


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