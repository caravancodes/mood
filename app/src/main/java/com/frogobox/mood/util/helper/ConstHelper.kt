package  com.frogobox.mood.util.helper

import android.Manifest
import android.os.Environment
import com.frogobox.mood.BuildConfig

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * PublicSpeakingBooster
 * Copyright (C) 16/08/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.publicspeakingbooster.helper
 *
 */
class ConstHelper {

    object ApiUrl {

    }

    object Date {

        // Format Second
        const val SECOND_MILLIS = 1000
        const val MINUTE_MILLIS = 60 * SECOND_MILLIS
        const val HOUR_MILLIS = 60 * MINUTE_MILLIS
        const val DAY_MILLIS = 24 * HOUR_MILLIS

        // Format Date
        const val DATE_TIME_GLOBAL = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" //
        const val DATE_TIME_STANDARD = "yyyy-MM-dd HH:mm:ss" // 2018-10-02 12:12:12
        const val DATE_ENGLISH_YYYY_MM_DD = "yyyy-MM-dd" // 2018-10-02
        const val DATE_ENGLISH_YYYY_MM_DD_CLEAR = "yyyy MM dd" // 2018 10 02
        const val DATE_DD_MM_YYYY = "dd-MM-yyyy" // 02-10-2018
        const val DATE_EEEE_DD_MM_YYYY = "EEEE, dd MMMM yyyy" // 02-10-2018
        const val DATE_DD_MM_YYYY_CLEAR = "dd MM yyyy" // 02-10-2018


        // Format Time
        const val TIME_GENERAL_HH_MM_SS = "HH:mm:ss" // 12:12:12
        const val TIME_GENERAL_HH_MM = "HH:mm" // 12:12

        // Format Day
        const val DAY_WITH_DATE_TIME_ENGLISH = "EEE, MMM dd yyyy HH:mm" // Mon, Aug 12 2018 12:12
        const val DAY_WITH_DATE_TIME_LOCALE = "EEE, dd MMM yyyy HH:mm" // Sen, 12 Agt 2019 12:12
        const val DAY_WITH_DATE_TIME_ENGLISH_FULL =
            "EEEE, MMMM dd yyyy HH:mm" // Monday, August 12 2018 12:12
        const val DAY_WITH_DATE_TIME_LOCALE_FULL =
            "EEEE, dd MMMM yyyy HH:mm" // Senin, 12 Agustus 2018 12:12

    }

    object RoomDatabase {
        const val BASE_TABLE_NAME = "table"
        const val TABLE_NAME_DATA = "wallpaper_$BASE_TABLE_NAME"
        const val TABLE_NAME_FAVORITE = "favorite_$TABLE_NAME_DATA"

        const val ATTR_TABLE_ID = "table_id"
        const val ATTR_ID = "id"
        const val ATTR_LINK_IMAGE = "link_image"

    }

    object SQLiteDatabase {
        const val SQLITE_DATABASE_VERSION = 1
        // Names of table in the database
        const val TABLE_SAMPLEDATA = "SAMPLE_DATA"

        // Names of columns in the databases in this example we only use one table
        const val KEY_ID = "id"
        const val KEY_DOMAIN = "domain"
        const val KEY_USERNAME = "username"
        const val KEY_LENGTH = "length"
    }

    object TypeData {
        const val TYPE_INT = "TYPE_INT"
        const val TYPE_STRING = "TYPE_STRING"
        const val TYPE_FLOAT = "TYPE_FLOAT"
        const val TYPE_BOOLEAN = "TYPE_BOOLEAN"
        const val TYPE_OBJECT = "TYPE_OBJECT"
    }

    object Code {
        const val CODE_NAME = 1
        const val CODE_REQUEST_VIDEO_PERMISSIONS = 1
        val CODE_VIDEO_PERMISSIONS =
            arrayOf(Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO)

    }

    object Arg {
        const val BASE_ARGUMENTS = BuildConfig.APPLICATION_ID
        const val ARGUMENTS_SCRIPT = "$BASE_ARGUMENTS.ARGUMENTS_SCRIPT"
        const val ARGUMENTS_EXAMPLE_SCRIPT = "$BASE_ARGUMENTS.ARGUMENTS_EXAMPLE_SCRIPT"
        const val ARGUMENTS_FAVORITE_SCRIPT = "$BASE_ARGUMENTS.ARGUMENTS_FAVORITE_SCRIPT"
    }

    object Pref {
        // shared pref mode
        const val PRIVATE_MODE = 0

        // Shared preferences file name
        const val PREF_NAME = "privacy_friendly_apps"
        const val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"

        const val PREF_CURRENT_PAGE = "currentPage"
        const val PREF_COLOR = "pref_color"
        const val PREF_MY = "myPref"

        const val PREF_ANIMATION_ACTIVATED = "pref_animationActivated"
        const val PREF_SETTINGS_DISPLAY = "settings_display"
    }

    object Extra {
        const val BASE_EXTRA = BuildConfig.APPLICATION_ID
        const val EXTRA_OPTION = "$BASE_EXTRA.EXTRA_OPTION"

        const val EXTRA_N = "$BASE_EXTRA.EXTRA_N"
        const val EXTRA_NEW = "$BASE_EXTRA.EXTRA_NEW"
        const val EXTRA_FILENAME = "$BASE_EXTRA.EXTRA_FILENAME"
        const val EXTRA_UNDO = "$BASE_EXTRA.EXTRA_UNDO"
        const val EXTRA_POINTS = "$BASE_EXTRA.EXTRA_POINTS"


    }

    object Value {
        const val VALUE_SENSOR_ORIENTATION_DEFAULT_DEGREES = 90
        const val VALUE_SENSOR_ORIENTATION_INVERSE_DEGREES = 270

    }

    object Tag {
        const val TAG_ACTIVITY_EDIT = 300
        const val TAG_ACTIVITY_CREATE = 301
        const val TAG_ACTIVITY_DETAIL = 302

        const val TAG_FROM_ACTIVITY = 801
        const val TAG_FROM_FRAGMENT = 800

        const val TAG_CAMERA_VIDEO = "Camera2VideoFragment"

    }

    object Ext {

        const val DEF_DRAWABLE = "drawable"
        const val DEF_RAW = "raw"
        const val MP4 = ".mp4"
        const val PNG = ".png"
        const val TXT = ".txt"

    }

    object Dir {
        const val BASE_FILE_NAME = "SPEECH_"
        const val BASE_DIR_NAME = "BaseMusicPlayer"
        val DIR_NAME = "${Environment.DIRECTORY_PICTURES}/$BASE_DIR_NAME"

        val VIDEO_FILE_NAME = "$BASE_FILE_NAME${System.currentTimeMillis()}${Ext.MP4}"

    }

    object Const {

        const val OPTION_GET = "OPTION_GET"
        const val OPTION_DELETE = "OPTION_DELETE"

        const val DEFAULT_NULL = "null"
        const val DEFAULT_ERROR_MESSAGE = "Failed"
        const val FRAGMENT_DIALOG = "dialog"

        const val SPLASH_INTERVAL = 1000

        const val EXTENSION_CSV = ".csv"
        const val BASE_PATH_RAW = "src/com/frogobox/raw"
        const val PATH_DATA_CSV = "/influencers$EXTENSION_CSV"
        const val PATH_RAW_CSV_DATA = BASE_PATH_RAW + PATH_DATA_CSV

        const val TYPE_MAIN_WALLPAPER = 100

        const val FILE_STATISTIC = "statistic"
        const val FILE_STATE = "state"

    }

    object Games {
        const val INIT_ADDINGSPEED: Long = 100
        const val INIT_MOVINGSPEED: Long = 80
        const val INIT_SCALINGSPEED: Long = 100
        const val INIT_SCALINGFACTOR = 1.1f

        const val WINTHRESHOLD = 2048
        const val PROPABILITYFORTWO = 0.9
    }

}