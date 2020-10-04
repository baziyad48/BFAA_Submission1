package com.example.bfaa_submission1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val user = intent.getParcelableExtra<User>("data")
        supportActionBar?.title = user?.name

        if (user != null) {
            img_detail.setImageResource(user.avatar)
            tv_detail_name.text = user.name
            tv_detail_username.text = "@${user.username}"
            tv_detail_repository.text = user.repository
            tv_detail_followers.text = user.follower
            tv_detail_following.text = user.following
            tv_detail_company.text = "Work for ${user.company}"
            tv_detail_location.text = "From ${user.location}"
        }

    }
}