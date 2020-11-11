package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.BitmapFactory
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val Streamlist: ArrayList<Streaming> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Streamlist.add(
            Streaming(
                "Netflix",
                BitmapFactory.decodeResource(
                    resources, R.drawable.netplik
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Viu",
                BitmapFactory.decodeResource(
                    resources, R.drawable.viu
                )
            )
        )
        Streamlist.add(
            Streaming(
                "HooQ",
                BitmapFactory.decodeResource(
                    resources, R.drawable.hooq
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Catch Play",
                BitmapFactory.decodeResource(
                    resources, R.drawable.catchplay
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Cinema Box",
                BitmapFactory.decodeResource(
                    resources, R.drawable.cinemabox
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Iflix",
                BitmapFactory.decodeResource(
                    resources, R.drawable.iflix
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Max Stream",
                BitmapFactory.decodeResource(
                    resources, R.drawable.maxstream
                )
            )
        )
        layoutManager = GridLayoutManager(this, 3)
        streaminglist.layoutManager = layoutManager
        streaminglist.adapter = RecyclerViewAdapter(this, Streamlist)
    }
}