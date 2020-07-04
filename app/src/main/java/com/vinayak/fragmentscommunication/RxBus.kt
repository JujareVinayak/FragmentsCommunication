package com.vinayak.fragmentscommunication

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject




object RxBus {
    private val publisher = PublishSubject.create<String>()
    fun publish(event: String) {
        publisher.onNext(event)
    }

    // Listen should return an Observable
    fun listen(): Observable<String>? {
        return publisher
    }
}