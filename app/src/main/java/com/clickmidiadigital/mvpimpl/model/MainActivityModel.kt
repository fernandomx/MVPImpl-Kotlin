package com.clickmidiadigital.mvpimpl.model

import com.clickmidiadigital.mvpimpl.interfaces.PInterface

class MainActivityModel: PInterface.DataModel {
    private var counter=0

    override fun incrementCounter() {
        counter++
    }

    override fun getCounter(): Int {
        return counter
    }
}