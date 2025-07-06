package com.example.ecommersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ecommersapp.databinding.FragmentSigninBinding
import com.example.ecommersapp.databinding.FragmentStartedBinding

class SigninFragment : Fragment() {
    private lateinit var binding: FragmentSigninBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSigninBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageView2.setOnClickListener(){
          findNavController().popBackStack()
        }
        binding.button5.setOnClickListener(){
            findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToLoginFragment())
        }
        binding.textView5.setOnClickListener(){
            findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToRegisterFragment())
        }
    }
}