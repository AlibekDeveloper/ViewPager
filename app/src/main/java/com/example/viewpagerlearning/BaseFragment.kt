package com.example.viewpagerlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import java.util.Scanner
import android.view.ViewGroup
import java.util.Random

abstract class BaseFragment(private val layoutId: Int) : Fragment() {

    val pageId = Random.nextLong(2021, 2021*3)
    var pagePos = -1
    protected lateinit var fragmentReplacer: FragmentReplacer

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    fun setPageInfo(pagePos: Int, fragmentReplacer: FragmentReplacer) {
        this.pagePos = pagePos
        this.fragmentReplacer = fragmentReplacer
    }
}