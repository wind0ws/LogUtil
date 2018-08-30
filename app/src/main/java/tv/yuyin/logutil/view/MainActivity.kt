package tv.yuyin.logutil.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tv.yuyin.logutil.LLog
import tv.yuyin.logutil.R
import tv.yuyin.logutil.data.TestCls

class MainActivity : AppCompatActivity(),View.OnClickListener {

    companion object {
        private const val TAG = "CustomTAG" //MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        LLog.Config.allowPrint = false //disable print log
        LLog.Config.forceLevelE = true //force print log with level error

        LLog.iWithTag(TAG, "Infomation:%d", System.currentTimeMillis())
        LLog.d("This is log: %d", javaClass.interfaces.size)
        val list = listOf("1", "2", "3", "4")
        val map = mapOf(1 to "hefei", 2 to "beijing", 3 to "nanjing")
        LLog.obj(list)
        LLog.obj(map)
        LLog.objWithTag(TAG, map)

        LLog.wWithTag(TAG, "MainActivity tag")
        val testCls = TestCls()
        LLog.i("Will print object:")
        LLog.obj(testCls)
    }

    override fun onStart() {
        super.onStart()
        LLog.w("onStart %d", System.currentTimeMillis())
    }

    override fun onResume() {
        super.onResume()
        LLog.json("{\"aa\":1223}")
        LLog.jsonWithTag(TAG, "{\"abc\":\"abcdefghi\",\"efg\":12345}")
    }

    override fun onPause() {
        super.onPause()
        LLog.i("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        LLog.e("onDestroy")
    }

    override fun onClick(clickedView: View?) {

    }
}
