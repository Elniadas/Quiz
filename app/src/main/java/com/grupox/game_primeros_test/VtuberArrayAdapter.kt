package com.grupox.game_primeros_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.spinner_item.view.*

class VtuberArrayAdapter(context: Context, vtuberList: List<Vtuber>) :
    ArrayAdapter<Vtuber>(context, 0, vtuberList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {

        val vtuber = getItem(position)

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.spinner_item, parent, false)
        view.vtuberImage.setImageResource(vtuber!!.image)
        view.vtuberName.text = vtuber.name

        return view
    }
}