package work.beltran.rentaboat


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.fragment_feed.view.*


class FeedFragment : Fragment() {


    private val boats = listOf<Boat>(
            Boat(
                    id = 1,
                    name = "Canoa Larga",
                    location = "Tenerife",
                    picture = R.drawable.boat_1

            ),

            Boat(
                    id = 2,
                    name = "Canoa Larga",
                    location = "Tenerife",
                    picture = R.drawable.boat_2

            )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feed, container, false)

        view.recycler.adapter = BoatsAdapter()

        return view
    }


}

class BoatsAdapter() : RecyclerView.Adapter<BoatsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoatsViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: BoatsViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class BoatsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

}
