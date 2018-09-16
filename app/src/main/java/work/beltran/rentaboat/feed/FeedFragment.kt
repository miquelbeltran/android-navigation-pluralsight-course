package work.beltran.rentaboat.feed


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_feed.view.*
import work.beltran.rentaboat.R


class FeedFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        view.recycler.adapter = BoatsAdapter(BOATS, ::onBoatClick)
        view.recycler.layoutManager = LinearLayoutManager(view.context)
        return view
    }

    private fun onBoatClick(boatId: Int) {
        activity?.findNavController(R.id.nav_container)?.navigate(R.id.action_homeFragment_to_boatFragment)
    }

}

