package com.clickmidiadigital.mvpimpl.presenter

import com.clickmidiadigital.mvpimpl.interfaces.PInterface
import com.clickmidiadigital.mvpimpl.model.MainActivityModel

class MainActivityPresenter(view: PInterface.DataView): PInterface.Presenter {
    private var view: PInterface.DataView = view
    private var model: PInterface.DataModel = MainActivityModel()

    init{
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
     return model.getCounter().toString()
    }


}