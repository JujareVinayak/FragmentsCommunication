package com.vinayak.fragmentscommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.vinayak.fragmentscommunication.viewmodel.SharedViewModel


class SecondFragmentViewModel:Fragment() {

    private lateinit var sharedViewModel: SharedViewModel
    private lateinit var txtName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedViewModel = ViewModelProviders.of(requireActivity()).get(SharedViewModel::class.java)
    }

    companion object {
        fun newInstance(): SecondFragmentViewModel {
            return SecondFragmentViewModel()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_second_viewmodel,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        sharedViewModel.mutableLiveData.observe(requireActivity(),object : Observer<String>{
            override fun onChanged(t: String?) {
                txtName.text = t
            }
        })

    }

}