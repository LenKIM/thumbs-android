package com.thumbs.android.thumbsAndroid.ui.setting

import android.util.Log
import com.thumbs.android.thumbsAndroid.repositories.UserRepository
import com.thumbs.android.thumbsAndroid.ui.base.BasePresenter

class SettingPresenter(
    val userRepository: UserRepository
) : SettingContract.SettingUserActionListener {


    var settingView : SettingContract.SettingView?= null

    override fun load() {
        userRepository.getUser().subscribe ({
            Log.d("TEST","성공")
        },{
            Log.d("TEST","실패")
        })
    }

    override fun attachView(view: SettingContract.SettingView) {
        this.settingView = view
    }

    override fun removeView() {
        settingView = null
    }

}