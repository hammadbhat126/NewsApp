package io.realworld.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         val songsObjects: MutableList<Song> = mutableListOf<Song>()
        songsObjects.add(Song("Hello","jUST DO THE HELLO"))
        songsObjects.add(Song("BYE","jUST DO THE HELLO"))
        songsObjects.add(Song("RUKOO","jUST DO THE HELLO"))
        songsObjects.add(Song("RUKOO","jUST DO THE HELLO"))
        songsObjects.add(Song("Hello","jUST DO THE HELLO"))
        songsObjects.add(Song("Hello","jUST DO THE HELLO"))
        songsObjects.add(Song("Hello","jUST DO THE HELLO"))

       // now create objects for songs


        // now set adapter set
        songlist.adapter= MyAdapter(songsObjects)
        // on recylcerview we need to set layout manager for display items (Linear layout amanger set)
        songlist.layoutManager= LinearLayoutManager(this)

    }
}