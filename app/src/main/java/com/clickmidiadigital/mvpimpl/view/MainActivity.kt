package com.clickmidiadigital.mvpimpl.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clickmidiadigital.mvpimpl.R
import com.clickmidiadigital.mvpimpl.interfaces.PInterface
import com.clickmidiadigital.mvpimpl.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PInterface.DataView {
    private var presenter: MainActivityPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        result.text = presenter?.getCounter()
        btn.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateView() {
        result.text = presenter?.getCounter()
    }
}