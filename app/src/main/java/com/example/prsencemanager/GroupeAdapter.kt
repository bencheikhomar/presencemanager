package com.example.prsencemanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GroupeAdapter(
    private val context: Context,
    private val groupes: List<Groupe>
) : BaseAdapter() {

    private class ViewHolder(
        val imageView: ImageView,
        val txtNom: TextView,
        val txtNombre: TextView
    )

    override fun getCount(): Int = groupes.size

    override fun getItem(position: Int): Any = groupes[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_groupe, parent, false)
            holder = ViewHolder(
                view.findViewById(R.id.imgGroupeIcon),
                view.findViewById(R.id.txtNomGroupe),
                view.findViewById(R.id.txtNombreStagiaires)
            )
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val groupe = groupes[position]
        holder.imageView.setImageResource(groupe.iconResId)
        holder.txtNom.text = groupe.nom
        holder.txtNombre.text = "${groupe.nombreStagiaires} stagiaires"

        return view
    }
}
