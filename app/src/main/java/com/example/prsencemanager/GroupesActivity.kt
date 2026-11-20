package com.example.prsencemanager

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GroupesActivity : AppCompatActivity() {

    private val groupesList = listOf(
        Groupe("DEVAM201", 24),
        Groupe("DEVAM202", 22),
        Groupe("DEVAM203", 26),
        Groupe("DEVAM204", 25),
        Groupe("DEVAM205", 23),
        Groupe("DEVAM206", 21),
        Groupe("DEVAM207", 28),
        Groupe("DEVAM208", 20),
        Groupe("DEVAM209", 27),
        Groupe("DEVAM210", 22)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_groupes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listView = findViewById<ListView>(R.id.listViewGroupes)
        val btnArrayAdapter = findViewById<Button>(R.id.btnArrayAdapter)
        val btnBaseAdapter = findViewById<Button>(R.id.btnBaseAdapter)

        // Adapter 1: Simple ArrayAdapter using group names
        val nomsGroupes = groupesList.map { it.nom }
        val simpleAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            nomsGroupes
        )

        // Adapter 2: Custom BaseAdapter
        val customAdapter = GroupeAdapter(this, groupesList)

        // Set default adapter (Custom BaseAdapter)
        listView.adapter = customAdapter

        // Button click to switch to ArrayAdapter
        btnArrayAdapter.setOnClickListener {
            listView.adapter = simpleAdapter
            Toast.makeText(this, "Liste simple (ArrayAdapter)", Toast.LENGTH_SHORT).show()
        }

        // Button click to switch to BaseAdapter
        btnBaseAdapter.setOnClickListener {
            listView.adapter = customAdapter
            Toast.makeText(this, "Liste personnalisée (BaseAdapter)", Toast.LENGTH_SHORT).show()
        }

        // Item click listener to show group info
        listView.setOnItemClickListener { _, _, position, _ ->
            val groupe = groupesList[position]
            AlertDialog.Builder(this)
                .setTitle("Informations du groupe")
                .setMessage("Groupe : ${groupe.nom}\nNombre de stagiaires : ${groupe.nombreStagiaires}")
                .setPositiveButton("OK", null)
                .show()
        }
    }
}
