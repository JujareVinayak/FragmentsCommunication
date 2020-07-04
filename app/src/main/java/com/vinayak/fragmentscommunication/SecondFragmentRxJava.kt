package com.vinayak.fragmentscommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class SecondFragmentRxJava:Fragment() {
    lateinit var txtResult: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_second_rxjava,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtResult = view.findViewById(R.id.textViewName)
        //  listen RxJava event here
        RxBus.listen()?.subscribe(getInputObserver());
    }

    companion object{
        fun getInstance():SecondFragmentRxJava{
            return SecondFragmentRxJava()
        }
    }

    private fun getInputObserver():Observer<String>{
        return object :Observer<String>{
            override fun onComplete() {

            }

            override fun onSubscribe(d: Disposable) {

            }

            override fun onNext(s: String) {
                txtResult.setText(s);
            }

            override fun onError(e: Throwable) {
            }

        }
    }

}