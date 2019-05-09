package com.rosefinches.smiledialog;

import android.content.res.ColorStateList;

import com.rosefinches.smiledialog.enums.DialogType;
import com.rosefinches.smiledialog.interfac.OnCancelClickListener;
import com.rosefinches.smiledialog.interfac.OnConformClickListener;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Author: wangbl
 * Date: 2019/5/8 3:21 PM
 * Email:js_wangbl@hotmail.com
 * Description:Builder 的 Options
 */
class DialogOptions {

    enum Widgets {
        TITLE, CONTENT, CONFORM, CANCEL
    }

    AppCompatActivity activity;

    //标题、内容、取消按钮、确定按钮文字（String）
    CharSequence titleText, contentText, cancelText, conformText;
    //确定、取消背景颜色
    ColorStateList conformBgColor, cancelBgColor;
    //标题、内容、确认按钮、取消按钮字体颜色
    ColorStateList titleTextColor, contentTextColor, conformTextColor, cancelTextColor;
    //标题隐藏
    boolean isTitleHided;
    //确认按钮监听
    OnConformClickListener conformClickListener;
    //取消按钮监听
    OnCancelClickListener cancelClickListener;
    //dialog 类型枚举
    DialogType type;
    //true:dialog弹出后会点击屏幕或物理返回键，dialog不消失
    boolean cancelable = true;
    //  点击区域外，是否消失
    boolean cancelableOnTouchOutside = true;
    //动画
    Integer windowAnimation;
}