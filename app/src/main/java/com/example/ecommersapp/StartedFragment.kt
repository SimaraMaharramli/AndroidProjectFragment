package com.example.ecommersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ecommersapp.databinding.FragmentLoginBinding
import com.example.ecommersapp.databinding.FragmentStartedBinding


class StartedFragment : Fragment() {
    private lateinit var binding: FragmentStartedBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStartedBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener(){
        findNavController().navigate(StartedFragmentDirections.actionStartedFragmentToSigninFragment())
        }
    }
}