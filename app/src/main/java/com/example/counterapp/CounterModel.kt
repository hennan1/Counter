package com.example.counterapp

class CounterModel (var count:Int)

class CounterRepository {
    private var _counter = CounterModel(0)

    fun getCounter()= _counter

    fun modelInc(){
        _counter.count++
    }

    fun modelDec(){
        _counter.count--
    }

}