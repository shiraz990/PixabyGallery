package com.app.base.mainapp.presentations.detail

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseActivity
import com.app.base.mainapp.utils.Navigator
import kotlinx.android.synthetic.main.app_bar_main.*
import org.koin.android.ext.android.inject


class ArticleDetailActivity : BaseActivity()  {

    private val navigator: Navigator by inject()
    private lateinit var navController: NavController


    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.BaseTheme)

        setContentView(R.layout.activity_article_detail)
        setSupportActionBar(tool_bar)


        val host: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?
                ?: return
        host.arguments = intent.extras




        navController = host.navController
        //NavigationUI.setupActionBarWithNavController(this, navController)

        val inflater = host.navController.navInflater
        val graph = inflater.inflate(R.navigation.nav_article_detail)
        graph.startDestination = R.id.articleDetail
        navController.setGraph(graph, intent.extras)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            val dest: String = try {
                resources.getResourceName(destination.id)
            } catch (e: Resources.NotFoundException) {
                Integer.toString(destination.id)
            }
        }

        tool_bar.setNavigationOnClickListener {
            finish()
        }





    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (resultCode == Activity.RESULT_OK) {

            }
        }
    }

    private fun setTitleToolbar(toolbar: Toolbar, title: String) {

        toolbar.findViewById<TextView>(R.id.tv_title).text = title

    }


}


