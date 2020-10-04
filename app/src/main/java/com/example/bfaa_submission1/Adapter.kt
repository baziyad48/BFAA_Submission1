package com.example.bfaa_submission1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter internal constructor(private val context: Context): BaseAdapter(){
    internal var users = arrayListOf<User>()

    override fun getCount(): Int {
        return users.size
    }

    override fun getItem(p0: Int): Any {
        return users[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var itemView = p1

        if(itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.rv_user, p2, false)
        }

        val viewHolder = ViewHolder(itemView as View)
        val user = getItem(p0) as User
        viewHolder.bind(user)
        return itemView
    }

    private inner class ViewHolder internal constructor(view: View){
        private val tv_name:TextView = view.findViewById(R.id.tv_name)
        private val tv_username:TextView = view.findViewById(R.id.tv_username)
        private val img_user:ImageView = view.findViewById(R.id.img_user)

        internal fun bind(user: User){
            tv_name.text = user.name
            tv_username.text = user.username
            img_user.setImageResource(user.avatar)
        }
    }
}