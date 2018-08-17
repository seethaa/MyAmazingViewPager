package com.example.seetha.myamazingviewpager


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.*


class PageFragment : Fragment() {
    private var position: Int? = null
    private var key: Int? = null

    companion object {

        private const val KEY_POSITION = "position"
        private const val KEY_COLOR = "color"

        @JvmStatic
        fun newInstance(param1: Int, param2: Int) =
                PageFragment().apply {
                    arguments = Bundle().apply {
                        putInt(KEY_POSITION, param1)
                        putInt(KEY_COLOR, param2)
                    }
                }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            position = it.getInt(KEY_POSITION)
            key = it.getInt(KEY_COLOR)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Get data from Bundle (created in method newInstance)
        arguments?.let {
            val position = it.getInt(KEY_POSITION, -1)
            val color = it.getInt(KEY_COLOR, -1)

            // Update widgets with it
            fragment_page_rootview.setBackgroundColor(color)
            fragment_page_title.text = "Page # $position"
        }
    }


}
