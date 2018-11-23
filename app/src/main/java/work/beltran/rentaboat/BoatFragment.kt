package work.beltran.rentaboat


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_boat.view.*
import work.beltran.rentaboat.feed.BOATS
import work.beltran.rentaboat.feed.getBoat


class BoatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val id = BoatFragmentArgs.fromBundle(arguments).id

        val boat = BOATS.getBoat(id)

        val view = inflater.inflate(R.layout.fragment_boat, container, false)
        view.nameTextView.text = boat.name
        view.locationTextView.text = boat.location
        view.imageView2.setImageResource(boat.picture)
        view.priceTextView.text = boat.price
        return view
    }
}
