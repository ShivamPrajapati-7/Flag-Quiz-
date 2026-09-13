package com.shivaminteractive.flagquiz.database

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.shivaminteractive.flagquiz.model.flagsmodel
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper

class flagsdao {
    fun getrandomrecords(helper: DatabaseCopyHelper): ArrayList<flagsmodel>
    {
        val recordlist=ArrayList<flagsmodel>()
        val db: SQLiteDatabase =helper.writableDatabase
        val cursor: Cursor=db.rawQuery("select * from flags order by random() Limit 10",null)
        val idindex=cursor.getColumnIndex("flag_id")
        val nameindex=cursor.getColumnIndex("country_name")
        val flagindex=cursor.getColumnIndex("flag_name")
        while (cursor.moveToNext())
        {
            val recoard=flagsmodel(cursor.getInt(idindex),cursor.getString(nameindex),cursor.getString(flagindex))
            recordlist.add(recoard)
        }
        cursor.close()
        return recordlist
    }

    fun getrandomthreerecords(helper: DatabaseCopyHelper, id:Int): ArrayList<flagsmodel>
    {
        val recordlist=ArrayList<flagsmodel>()
        val db: SQLiteDatabase =helper.writableDatabase
        val cursor: Cursor=db.rawQuery("select * from flags where flag_id!=? order by random() Limit 3",arrayOf(id.toString()))
        val idindex=cursor.getColumnIndex("flag_id")
        val nameindex=cursor.getColumnIndex("country_name")
        val flagindex=cursor.getColumnIndex("flag_name")
        while (cursor.moveToNext())
        {
            val recoard=flagsmodel(cursor.getInt(idindex),cursor.getString(nameindex),cursor.getString(flagindex))
            recordlist.add(recoard)
        }
        cursor.close()
        return recordlist
    }
}
