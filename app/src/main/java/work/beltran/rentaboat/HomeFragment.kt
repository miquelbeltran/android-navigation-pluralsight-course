package work.beltran.rentaboat


import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import work.beltran.rentaboat.R.id.toolbar



/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
                .setupWithNavController(navHostFragment.navController)

        // I don't like the Up navigation arrows
//        view.findViewById<Toolbar>(R.id.toolbar)
//                .setupWithNavController(navHostFragment.navController)

        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        // Custom navigation listener allows me to change the title
        navHostFragment.navController.addOnNavigatedListener(CustomNavigatedListener(toolbar))

        return view
    }

    class CustomNavigatedListener(val toolbar: Toolbar) : NavController.OnNavigatedListener {
        override fun onNavigated(controller: NavController, destination: NavDestination) {
            toolbar.title = destination.label
        }
    }

}
