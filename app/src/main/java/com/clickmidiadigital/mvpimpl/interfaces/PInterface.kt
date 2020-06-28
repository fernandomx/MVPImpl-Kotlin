package com.clickmidiadigital.mvpimpl.interfaces

interface PInterface {

    interface DataView{
        fun initView()
        fun updateView()

    }
    interface Presenter{
        fun incrementValue()
        fun getCounter(): String

    }
    interface DataModel{
        fun incrementCounter()
        fun getCounter(): Int
    }
}